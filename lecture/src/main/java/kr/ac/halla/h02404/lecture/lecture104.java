package kr.ac.halla.h02404.lecture;

import java.util.HashMap;
import java.util.Iterator;

public class lecture104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.put(1, "me");
		map.put(2, "her");
		map.put(3, "him");
		map.put(4, "we");
		map.put(5, "you");
		map.put(6, "them");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.remove(4));
		System.out.println(map);
		System.out.println(map.replace(1, "Bu"));
		System.out.println(map);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("her"));
		//keyset
		Iterator<Integer> key=map.keySet().iterator();
		while(key.hasNext()) {
			Integer k=key.next();
		}
		//EntrySet
	}

}
