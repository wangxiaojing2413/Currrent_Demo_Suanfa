package cn.lzrabbit.structure.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap�����Ѿ�ʵ����˳��洢��Ĭ��������ǰ���Ԫ�ص����˳��洢��Ҳ�������ð��շ���˳��洢���������ȡ�����ݷ�����ǰ�棬
 * �����ȡ�����ݷ�������棬Ȼ��������һ���ж��Ƿ�ɾ���������ݵķ�����Ĭ���Ƿ���false������ɾ�����ݣ�
 * ����ʹ��LinkedHashMapʵ��LRU����ķ������Ƕ�LinkedHashMapʵ�ּ򵥵���չ
 * ����չ��ʽ�����֣�һ����inheritance��һ����delegation������ʹ��ʲô��ʽ������ϲ��
 * 
 * @author ietm
 * 
 * @param <K>
 * @param <V>
 */
/**
 * ����inheritance��ʽʵ�ֱȽϼ򵥣�����ʵ����Map�ӿڣ��ڶ��̻߳���ʹ��ʱ����ʹ��
 * Collections.synchronizedMap()����ʵ���̰߳�ȫ����
 */
public class LRUCache2<K, V> extends LinkedHashMap<K, V> {
	private final int MAX_CACHE_SIZE;

	public LRUCache2(int cacheSize) {
		super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
		MAX_CACHE_SIZE = cacheSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > MAX_CACHE_SIZE;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<K, V> entry : entrySet()) {
			sb.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
		}
		return sb.toString();
	}
}

/*
LinkedHashMap��һ�����캯����������accessOrderΪtrueʱ�����ᰴ�շ���˳������������ʵķ�����ǰ��������ʵķ��ں���
public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
      super(initialCapacity, loadFactor);
      this.accessOrder = accessOrder;
}

//LinkedHashMap�Դ����ж��Ƿ�ɾ�����ϵ�Ԫ�ط�����Ĭ�Ϸ���false������ɾ��������
����Ҫ���ľ�����д���������������һ������ʱɾ��������
protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
      return false;
}
*/