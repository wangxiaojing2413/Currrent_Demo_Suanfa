import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {

		Map plainMap = new HashMap();
		plainMap.put("a3", "aa");
		plainMap.put("b1", "cc");
		plainMap.put("a2", "bb");
		plainMap.put("1", "1");

		for (Iterator iterator = plainMap.values().iterator(); iterator
				.hasNext();) {

			String name = (String) iterator.next();

			System.out.println(name);
		}
		System.out.println("==========================");

		// linkedMap在于存储数据你想保持进入的顺序与被取出的顺序一致的话，优先考虑LinkedMap，hashMap键只能允许为一条为空，value可以允许为多条为空，键唯一，但值可以多个
		// LinkedHashMap也是一个HashMap,但是内部维持了一个双向链表,可以保持顺序
		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("a3", "aa");
		map.put("b1", "cc");
		map.put("a2", "bb");
		map.put("1", "1");

		for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {

			String name = (String) iterator.next();

			System.out.println(name);

		}

	}
}
