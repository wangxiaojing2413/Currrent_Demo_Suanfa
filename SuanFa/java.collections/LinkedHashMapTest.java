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

		// linkedMap���ڴ洢�������뱣�ֽ����˳���뱻ȡ����˳��һ�µĻ������ȿ���LinkedMap��hashMap��ֻ������Ϊһ��Ϊ�գ�value��������Ϊ����Ϊ�գ���Ψһ����ֵ���Զ��
		// LinkedHashMapҲ��һ��HashMap,�����ڲ�ά����һ��˫������,���Ա���˳��
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
