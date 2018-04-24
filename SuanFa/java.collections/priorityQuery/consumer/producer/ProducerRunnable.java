package priorityQuery.consumer.producer;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerRunnable implements Runnable{
    private static final String name = "���պ��������Ի������������������֣����";
    private Random random = new Random();
    private PriorityBlockingQueue<Human> queue;
    public ProducerRunnable(PriorityBlockingQueue<Human> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i ++){
            Human human = new Human(random.nextInt(10000), "С" + name.charAt(i));
            queue.put(human);
            System.out.println(human + " ��ʼ�Ŷ�...");
        }
    }

}