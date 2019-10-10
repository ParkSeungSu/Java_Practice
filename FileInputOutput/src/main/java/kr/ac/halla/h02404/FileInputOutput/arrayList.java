package kr.ac.halla.h02404.FileInputOutput;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> idName=new HashMap<Integer, String>();
		System.out.println(idName.isEmpty());
		idName.put(1231, "Angular");
		idName.put(201632029, "ParkSeungSu");
		idName.put(111, "park");
		idName.put(123, "dsko");
		idName.put(223, "15154");
		idName.put(423, "sooeir");
		ArrayList<String> nameAL=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			Random random=new Random();
			nameAL.add(String.valueOf((char)(random.nextInt(26)+97)));
		}
		System.out.println(nameAL.toString());
		for(String a:nameAL) {
			System.out.println(a);
		}
		
		Stack<Entry<Integer, String>> IdName=new Stack<Entry<Integer,String>>();
		Set<Entry<Integer, String>> entryset=idName.entrySet();
		Iterator<Entry<Integer, String>> iter=entryset.iterator();
		while(iter.hasNext()) {
			Entry<Integer, String> e=iter.next();
			IdName.push(e);
		}
		System.out.println(IdName);
		
		while(!IdName.empty()) {
			System.out.println(IdName.pop());
		}
		System.out.println(nameAL);
		System.out.println(Collections.max(nameAL));
		Collections.shuffle(nameAL);
		System.out.println(nameAL);
		Collections.swap(nameAL, 3, 7);
		System.out.println(nameAL);
	}

}
