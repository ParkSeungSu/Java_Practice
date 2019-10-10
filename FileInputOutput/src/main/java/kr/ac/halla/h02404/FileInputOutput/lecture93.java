package kr.ac.halla.h02404.FileInputOutput;

import java.util.Iterator;
import java.util.Stack;

public class lecture93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> doubleStack=new Stack<Double>();
		System.out.println(doubleStack.size());
		System.out.println(doubleStack.empty());
		doubleStack.push(3.5);
		doubleStack.push(1.45);
		doubleStack.push(3.115);
		doubleStack.push(15.123);
		doubleStack.push(31.5);
		System.out.println(doubleStack.size());
		System.out.println(doubleStack.empty());
		System.out.println(doubleStack);
		System.out.println(doubleStack.peek());
		double sum=0;
		Iterator<Double> iter=doubleStack.iterator();
		while(iter.hasNext()) {
			sum+=iter.next();
		}
		System.out.println("iterator 사용: "+sum);
		sum=0;
		for(Double d : doubleStack) {
			sum+=d;
		}
		System.out.println("foreach : "+sum);
		sum=0;
		iter=doubleStack.iterator();
		for(;iter.hasNext();) {
			sum+=iter.next();
		}
		System.out.println("for문 사용 "+sum);
		
		sum=0;
		while(!doubleStack.isEmpty()) {
			sum+=doubleStack.pop();
		}
		System.out.println("Stack sum = "+sum);
	}

}
