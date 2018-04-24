

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Comparator<String> queueComparator = new VowelComparator();
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10,
				queueComparator);
		priorityQueue.add("orange");
		priorityQueue.add("fig");
		priorityQueue.add("watermelon");
		priorityQueue.add("lemon");
		while (priorityQueue.size() != 0) {
			System.out.println(priorityQueue.remove());
		}

		PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>(200,
				new VowelComparator());
		queue.add("orange");
		queue.add("fig");
		queue.add("watermelon");
		queue.add("lemon");
		while (queue.size() != 0) {
			System.out.println(queue.remove());
		}
	}
}