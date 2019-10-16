package kr.ac.halla.h02404.lecture;

import java.util.HashSet;

public class lecture103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(3);
		set1.add(5);
		set1.add(7);
		HashSet<Integer> set2=new HashSet<Integer>();
		set1.add(7);
		set1.add(8);
		set1.add(9);
		
		set1.addAll(set2);
		//합집합, 교집합 등드읃ㅇ
	}

}
