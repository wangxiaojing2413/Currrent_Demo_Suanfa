import java.util.LinkedList;


public class ConsumerProducerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ²Ö¿â´æ´¢µÄÔØÌå
	    LinkedList<Object> list = new LinkedList<Object>();
		Storage reposity = new Storage();
		reposity.setList(list);
		Consumer consumer1 = new Consumer(reposity);
		consumer1.setConsumer("consumer1");
		Consumer consumer2 = new Consumer(reposity);
		consumer2.setConsumer("consumer2");
		Producer producer = new Producer(reposity);
		producer.setProducer("producer");
		producer.setName("pro");
		consumer1.setName("concum1");
		consumer1.start();
		consumer2.setName("concum2");
		consumer2.start();
		producer.start();
	}

}
