package kr.ac.halla.h02404.lecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lecture105 {

	public static void main(String[] args) {

		ArrayList<Double> list= new ArrayList<Double>();
		list.add(1.4d);
		list.add(2.4d);
		list.add(15.4d);
		list.add(121.4d);
		System.out.println(list);
		
		Stack<Integer> stack= new Stack<Integer>();
		//LIFO
		stack.push(1);
		stack.push(12);
		stack.push(123);
		stack.push(1234);
		stack.push(12345);
		stack.push(123456);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println("["+stack.pop()+"]");
		}
		Queue<Integer> queue=new LinkedList<Integer>();
		//FIFO
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		System.out.println(queue);
		while(!queue.isEmpty()) {
			System.out.println("["+queue.remove()+"]");
		}
	}

}
