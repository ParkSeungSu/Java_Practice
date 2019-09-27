package kr.ac.halla.h02404.FileInputOutput;

import java.util.HashSet;

public class lecture8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Frequence> a = new HashSet<Frequence>();
		a.add(new Frequence(1, 2));
		a.add(new Frequence(2, 3));
		a.add(new Frequence(3, 5));
		a.add(new Frequence(1, 5));

		System.out.println(a);

	}

}
