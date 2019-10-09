package kr.ac.halla.h02404.FileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class lecture7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\cldkr\\OneDrive\\문서\\GitHub\\Java_Practice\\FileInputOutput\\Email-EuAll.txt"));
		HashSet<Integer> Sender = new HashSet<Integer>();
		HashSet<Integer> Reciever = new HashSet<Integer>();
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		HashMap<Integer,Integer> map2=new HashMap<Integer, Integer>();
		HashSet<Integer> mapping=new HashSet<Integer>();
		int cnt = 0;
		while (true) {
			String Line = br.readLine();
			if (Line == null)
				break;
			// #으로 시작하면 무시
			if (Line.startsWith("#"))
				continue;
			// \t
			String[] arr1 = Line.split("\t");
			int send = Integer.parseInt(arr1[0]);
			Sender.add(send);
			int recieve = Integer.parseInt(arr1[1]);
			if(send==93285) {
				mapping.add(recieve);
			}
			if(map.containsKey(send)) {
				map.put(send,map.get(send)+1);
				if(send==93285) {
					if(map2.containsKey(send)) {
						map2.put(send,map2.get(send)+1);
					}else {
						map2.put(send,1);
					}
				}
			}else {
				map.put(send,1);
				if(send==93285) {
					if(map2.containsKey(send)) {
						map2.put(send,map2.get(send)+1);
					}else {
						map2.put(send,1);
					}
				}
			}
			
			
			if(map.containsKey(recieve)) {
				map.put(recieve, map.get(recieve)+1);
			}else {
				map.put(recieve,1);
			}
			
		}
		Iterator<Integer> iterator=map.keySet().iterator();
		HashSet<Integer> CopySender = new HashSet<Integer>(Sender);
		HashSet<Integer> CopyReciever = new HashSet<Integer>(Reciever);
		System.out.println("보내고 받고 다 한 사람 수");
		Sender.retainAll(Reciever);
		System.out.println(Sender.size() + "명");
		Sender = CopySender;
		System.out.println("참여한 사람 수");
		Sender.addAll(Reciever);
		System.out.println(Sender.size() + "명");
		Sender = CopySender;
		System.out.println("보내기만 한 사람 수");
		Sender.removeAll(Reciever);
		System.out.println(Sender.size() + "명");
		Sender = CopySender;
		System.out.println("받기만 한 사람");
		Reciever.removeAll(Sender);
		System.out.println(Reciever.size() + "명");  
		Reciever = CopyReciever;
		// 등장횟수 힌트 ID 몇번 등장?
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			//여기에 코드작성: 각각의 요소를 출력하라
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println("93285에게 이메일 받은 사람 수");
		System.out.println(map2);
		System.out.println("명단");
		System.out.println(mapping);
		iterator=mapping.iterator();
		while(iterator.hasNext()) {
			cnt+=map.get(iterator.next());
		}
		System.out.println("93285에게 받은 사람들에게 받은 사람들의 수");
		System.out.println("총 "+cnt+"명");
	}
}
