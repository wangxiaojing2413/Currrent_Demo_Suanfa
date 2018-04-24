package com;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {
    // �ֿ����洢��
    private final int MAX_SIZE = 100;

    // �ֿ�洢������
    private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(100);  

    // ������Ʒ
    public void produce(String producer) {
        // ����ֿ�����
        if (list.size() == MAX_SIZE) {
            System.out.println("�ֿ���������" + producer + "���� ��ʱ����ִ����������!");            
        }

        // ������Ʒ
        try {
            list.put(new Object());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("��" + producer + "����������һ����Ʒ\t���ֲִ���Ϊ��:" + list.size());
    }

    // ���Ѳ�Ʒ
    public void consume(String consumer) {
        // ����ֿ�洢������
        if (list.size() == 0) {
            System.out.println("�ֿ��ѿգ���" + consumer + "���� ��ʱ����ִ����������!");            
        }

        try {
            list.take();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("��" + consumer + "����������һ����Ʒ\t���ֲִ���Ϊ��:" + list.size());        

    }

    public LinkedBlockingQueue<Object> getList() {
        return list;
    }

    public void setList(LinkedBlockingQueue<Object> list) {
        this.list = list;
    }
    public int getMAX_SIZE() {
        return MAX_SIZE;
    }
}