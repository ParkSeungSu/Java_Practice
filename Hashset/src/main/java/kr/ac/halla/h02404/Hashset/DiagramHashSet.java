package kr.ac.halla.h02404.Hashset;

import java.util.HashSet;
import java.util.Random;

public class DiagramHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> A=new HashSet<Integer>();
		HashSet<Integer> B=new HashSet<Integer>();
		Random random = new Random();
		for(int i=0;i<6;i++) {
			A.add(random.nextInt(10)+1);
			B.add(random.nextInt(10)+1);
		}
		HashSet<Integer> CA=A;
		HashSet<Integer> CB=B;
		System.out.println(A);
		System.out.println(B);
		System.out.println("집합 연산");
		System.out.println("A 합집합 B");
		A.addAll(B);
		System.out.println(A);
		A=CA;
		A.removeAll(B);
		System.out.println("A-B");
		System.out.println(A);
		A=CA;
		System.out.println("B-A");
		B.removeAll(A);
		System.out.println(B);
		B=CB;
		
	}

}
