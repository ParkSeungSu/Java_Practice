package kr.ac.halla.h02404.FileInputOutput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class queueLecture94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> linkedList=new LinkedList<String>();
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		System.out.println(linkedList);
		//remove로 fifo구현
		while(!linkedList.isEmpty()) {
			System.out.println("["+linkedList.remove()+"]");
		}
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		linkedList.add("E");
		linkedList.add("B");
		linkedList.add("G");
		linkedList.add("X");
		linkedList.add("E");
		linkedList.add("Z");
		System.out.println(linkedList);
		System.out.println(Collections.max(linkedList));
		
		System.out.println(linkedList);
	}

}
