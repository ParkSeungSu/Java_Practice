package kr.ac.halla.h02404.FileInputOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.PortableInterceptor.INACTIVE;

public class hashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Kim", 3);
		map.put("park", 10);
		map.put("gim", 4);
		map.put("big", 13);
		HashMap<Integer, HashMap<String, Integer>> stumap = new HashMap<Integer, HashMap<String, Integer>>();
		for (int i = 1; i < 10; i++) {
			HashMap<String, Integer> put = new HashMap<String, Integer>();
			put.put(String.valueOf((char) (i + 97)), i);
			stumap.put(i, put);
		}
		System.out.println("stumap 출력");
		System.out.println(stumap.toString());
		System.out.println("key set");
		Iterator<Integer> itr = stumap.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + " : " + stumap.get(key).toString());
		}
		System.out.println("EntrySet");
		Set<Entry<Integer, HashMap<String, Integer>>> eset = stumap.entrySet();
		Iterator<Entry<Integer, HashMap<String, Integer>>> ite = eset.iterator();
		while (ite.hasNext()) {
			Entry<Integer, HashMap<String, Integer>> entry = ite.next();
			System.out.println(entry.getKey() + " : " + entry.getValue().toString());
		}
		// 1) keySet
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			// 여기에 코드작성: 각각의 요소를 출력하라
			System.out.println(key + " -> " + map.get(key));

		}
		System.out.println(map.toString());
		System.out.println("KeySet");

		System.out.println("Entry Set");
		// 2)EntrySet
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterentry = entrySet.iterator();
		while (iterentry.hasNext()) {
			Entry<String, Integer> entry = iterentry.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
