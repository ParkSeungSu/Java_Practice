package kr.ac.halla.h02404.FileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class lecture7 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader
				("C:\\Users\\cldkr\\OneDrive\\문서\\GitHub\\Java_Practice\\FileInputOutput\\Email-EuAll.txt"));
		HashSet<Integer> Sender=new HashSet<Integer>();
		HashSet<Integer> Reciever=new HashSet<Integer>();
		HashMap<Integer, Integer> hashmap=new HashMap<Integer, Integer>();
		while (true) {
			String Line = br.readLine();
			if (Line == null)
				break;
			// #으로 시작하면 무시
			if (Line.startsWith("#"))
				continue;
			// \t
			String[] arr1 = Line.split("\t");
			Sender.add(Integer.parseInt(arr1[0]));
			Reciever.add(Integer.parseInt(arr1[1]));
			
		}
		HashSet<Integer> CopySender=new HashSet<Integer>(Sender);
		HashSet<Integer> CopyReciever=new HashSet<Integer>(Reciever);
		System.out.println("보내고 받고 다 한 사람 수");
		Sender.retainAll(Reciever);
		System.out.println(Sender.size()+"명");
		Sender=CopySender;
		System.out.println("참여한 사람 수");
		Sender.addAll(Reciever);
		System.out.println(Sender.size()+"명");
		Sender=CopySender;
		System.out.println("보내기만 한 사람 수");
		Sender.removeAll(Reciever);
		System.out.println(Sender.size()+"명");
		Sender=CopySender;
		System.out.println("받기만 한 사람");
		Reciever.removeAll(Sender);
		System.out.println(Reciever.size()+"명");
		Reciever=CopyReciever;
		
	}

}
