package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		System.out.println(set);
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("�̸� : "+e.getKey() + ", ���� : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : "+ set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int) it.next();
			total += i;
		}
		
	}

}
