package cn.lzrabbit.structure.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheTest {

	public static void main(String[] args) throws Exception {
		System.out.println("start...");

		lruCache1();
		lruCache2();
		lruCache3();
		lruCache4();

		System.out.println("over...");
	}

	static void lruCache1() {
		System.out.println();
		System.out
				.println("===========================LRU ����ʵ��===========================");
		LRUCache1<Integer, String> lru = new LRUCache1(5);
		lru.put(1, "11");
		lru.put(2, "11");
		lru.put(3, "11");
		lru.put(4, "11");
		lru.put(5, "11");
		System.out.println(lru.toString());
		lru.put(6, "66");
		lru.get(2);
		lru.put(7, "77");
		lru.get(4);
		System.out.println(lru.toString());
		System.out.println();
	}

	static <T> void lruCache2() {
		System.out.println();
		System.out
				.println("===========================LRU LinkedHashMap(inheritance)ʵ��===========================");
		LRUCache2<Integer, String> lru = new LRUCache2(5);
		lru.put(1, "11");
		lru.put(2, "11");
		lru.put(3, "11");
		lru.put(4, "11");
		lru.put(5, "11");
		System.out.println(lru.toString());
		lru.put(6, "66");
		lru.get(2);
		lru.put(7, "77");
		lru.get(4);
		System.out.println(lru.toString());
		System.out.println();
	}

	static void lruCache3() {
		System.out.println();
		System.out
				.println("===========================LRU LinkedHashMap(delegation)ʵ��===========================");
		LRUCache3<Integer, String> lru = new LRUCache3(5);
		lru.put(1, "11");
		lru.put(2, "11");
		lru.put(3, "11");
		lru.put(4, "11");
		lru.put(5, "11");
		System.out.println(lru.toString());
		lru.put(6, "66");
		lru.get(2);
		lru.put(7, "77");
		lru.get(4);
		System.out.println(lru.toString());
		System.out.println();
	}

	static void lruCache4() {
		System.out.println();
		System.out
				.println("===========================FIFO LinkedHashMapĬ��ʵ��===========================");
		final int cacheSize = 5;
		LinkedHashMap<Integer, String> lru = new LinkedHashMap<Integer, String>() {
			@Override
			protected boolean removeEldestEntry(
					Map.Entry<Integer, String> eldest) {
				return size() > cacheSize;
			}
		};
		lru.put(1, "11");
		lru.put(2, "11");
		lru.put(3, "11");
		lru.put(4, "11");
		lru.put(5, "11");
		System.out.println(lru.toString());
		lru.put(6, "66");
		lru.get(2);
		lru.put(7, "77");
		lru.get(4);
		System.out.println(lru.toString());
		System.out.println();
	}

}