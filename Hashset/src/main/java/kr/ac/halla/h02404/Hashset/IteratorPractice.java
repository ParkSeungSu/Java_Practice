package kr.ac.halla.h02404.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		HashSet<Integer> x = new HashSet<Integer>();
		x.add(5);
		x.add(3);
		x.add(10);
		x.add(13);
		x.add(17);
		Iterator<Integer> iterator = x.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator=x.iterator();
		for(;iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

}
