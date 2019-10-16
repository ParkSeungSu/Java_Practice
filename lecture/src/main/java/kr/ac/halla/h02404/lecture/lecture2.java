package kr.ac.halla.h02404.lecture;

import java.util.HashSet;
import java.util.Iterator;

public class lecture2 {

	public static void main(String[] args) {//HashSet CRUD
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.add(3);
		set.add(6);//중복됨
		set.add(6);
		set.add(7);
		set.add(8);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(4));
		System.out.println(set.remove(3));
		System.out.println(set);
		
		System.out.println(set.iterator());
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
