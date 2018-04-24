import java.util.LinkedList;

public class Storage
{
    // �ֿ����洢��
    private final int MAX_SIZE = 10;

    // �ֿ�洢������
    private LinkedList<Object> list = new LinkedList<Object>();

    // ������Ʒ
    public void produce(String producer)
    {
        synchronized (list)
        {
        	while(true){
        		try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
        		// ����ֿ�����
                while (list.size() == MAX_SIZE)
                {
                    System.out.println("�ֿ���������"+producer+"���� ��ʱ����ִ����������!");
                    try
                    {
                        // �������������㣬��������
                        list.wait();
                        System.out.println(producer + "��ȡ������������ִ�У�");
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                // ������Ʒ            
                list.add(new Object());            

                System.out.println("��"+producer+"����������һ����Ʒ\t���ֲִ���Ϊ��:" + list.size());

                list.notifyAll();
        	}
        }
    }

    // ���Ѳ�Ʒ
    public void consume(String consumer)
    {
        synchronized (list)
        {
        	while(true){
        		try {
    				Thread.sleep(2000);
    			} catch (InterruptedException e1) {
    				e1.printStackTrace();
    			}
        		 //����ֿ�洢������
                while (list.size()==0)
                {
                    System.out.println("�ֿ��ѿգ���"+consumer+"���� ��ʱ����ִ����������!");
                    try
                    {
                        // �������������㣬��������
                        list.wait();
                        System.out.println(consumer + "��ȡ������������ִ�У�");
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                
                list.remove();
                System.out.println("��"+consumer+"����������һ����Ʒ\t���ֲִ���Ϊ��:" + list.size());
                list.notifyAll();
        	}
        }
    }

    public LinkedList<Object> getList()
    {
        return list;
    }

    public void setList(LinkedList<Object> list)
    {
        this.list = list;
    }

    public int getMAX_SIZE()
    {
        return MAX_SIZE;
    }
}