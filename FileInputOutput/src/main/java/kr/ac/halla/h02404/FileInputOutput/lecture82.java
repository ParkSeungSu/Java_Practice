package kr.ac.halla.h02404.FileInputOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class lecture82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> idName = new HashMap<Integer, String>();
		System.out.println(idName.isEmpty());
		idName.put(1231, "Angular");
		idName.put(201632029, "ParkSeungSu");
		idName.put(111, "park");
		idName.put(123, "dsko");
		idName.put(223, "15154");
		idName.put(423, "sooeir");
		System.out.println(idName.toString());
		idName.put(111, "KIM");
		// 중복되지 않는 첫번째 변수에 대해서 값을 등록한다.
		System.out.println(idName.toString());
		System.out.println(idName.hashCode());
		System.out.println(idName.isEmpty());
		// containsKey: 주어진 key가 Map안에 존대 하는가?
		System.out.println("1231 : containsKey->" + idName.containsKey(1231));
		System.out.println("11111 : containsKey-> " + idName.containsKey(11111));
		// get:중복되지 않는 key에 대한 값을 (value)가져온다
		System.out.println("201632029 ->" + idName.get(201632029));
		System.out.println("0000 ->" + idName.get(0000));
		System.out.println("remove 111");
		System.out.println(idName);
		idName.remove(111);
		System.out.println(idName);
		/*
		 * Set<Entry<Integer, String>> entrySet=idName.entrySet();
		 * Iterator<Entry<Integer, String>> setIter=entrySet.iterator();
		 */
		Iterator<Entry<Integer, String>> entryIter = idName.entrySet().iterator();
		while (entryIter.hasNext()) {
			Entry<Integer, String> entry = entryIter.next();
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		Iterator<Integer> setiter = idName.keySet().iterator();
		while (setiter.hasNext()) {
			Integer key = setiter.next();
			System.out.println(key + "<-->" + idName.get(key));
		}

	}

}
