package kr.ac.halla.h02404.FileInputOutput;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.HashSet;

public class hashMap {

	public static void main(String[] args) throws IllegalMonitorStateException{
		// TODO Auto-generated method stub
		HashMap<Integer, HashMap<String, HashSet<Integer>>> map1;
		//생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.isEmpty());
		
		//put
		map.put(201632029,"Park SeungSu");
		map.put(201732026, "JASOM");
		System.out.println(map);
		System.out.println(map.keySet());

		//get
		String value=map.get(201632019);
		System.out.println(value);
		String nullValue=map.get(12315);
		System.out.println(nullValue);
		System.out.println(map.isEmpty());
		
		//constainKey
		System.out.println(map.containsKey(201632029));
		System.out.println(map.containsKey(201123));
		//remove
		String Jremove=map.remove(201732026);
		System.out.println(Jremove);
		System.out.println(map);
		
		//size
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.get(201632029));
		
	}

}
