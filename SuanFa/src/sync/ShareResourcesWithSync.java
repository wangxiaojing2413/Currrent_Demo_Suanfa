package sync;
import common.Resource;
import common.ShareResources;

import java.util.ArrayList;
import java.util.List;

public class ShareResourcesWithSync implements ShareResources {


    private int count= 0;
    private int capacity;
    private List<Resource> resources=new ArrayList<Resource>();
    private int number=0;

    public ShareResourcesWithSync(int capacity)
    {
        this.capacity=capacity;
    }

    synchronized public void push(String threadname,String name, String gender) {
        while (count==capacity) {
            try {
            	System.out.println("生产者等待！");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        resources.add(new Resource(threadname,name,gender));
        count++;
        System.out.println("生产 *************" + count);
        this.notifyAll();
    }

    synchronized public void pop(String name) {
        while(count==0)
        {
            try {
            	System.out.println("消费者等待！！！！！！！！！！！！！！");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Resource resource=resources.remove(0);
        System.out.print("消费---");
        System.out.println(number+++" && "+name+" ## "+resource.getThreadname()+" && "+resource.getName() +  " && " + resource.getGender()+"&还有" + (count - 1) +"个产品！");
        count--;
        this.notifyAll();
    }
}

