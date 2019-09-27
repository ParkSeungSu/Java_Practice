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
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(8,3);
		map.put(1,10);
		map.put(2,4);
		map.put(3,13);
		System.out.println("KeySet");
		
		//1) keySet
		Iterator<Integer> iterator=map.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			//여기에 코드작성: 각각의 요소를 출력하라
			System.out.println(key+" : "+map.get(key));
			
		}
		System.out.println("Entry Set");
		//2)EntrySet
		Set<Entry<Integer, Integer>> entrySet=map.entrySet();
		Iterator<Entry<Integer, Integer>> iterentry=entrySet.iterator();
		while(iterentry.hasNext()){
			Entry<Integer,Integer> entry=iterentry.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
