package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(100));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("�̸� : " + e.getKey() + "����: "+ e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ���:" + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		while(it.hasNext()) {
		}
		
	}

}
