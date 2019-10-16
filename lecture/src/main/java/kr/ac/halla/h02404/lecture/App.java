package kr.ac.halla.h02404.lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\cldkr\\OneDrive\\문서\\GitHub\\Java_Practice\\lecture\\target\\Email-EuAll.txt"));
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        HashSet<Integer> from9 = new HashSet<Integer>();
        HashSet<Integer> fromfrom9 = new HashSet<Integer>();
        ArrayList<Email> list=new ArrayList<Email>();
        //중복되지 않는 어떠한 from id에 대하여
        //보낸사람을 set로 한다.
        HashMap<Integer, HashSet<Integer>> toSet=new HashMap<Integer, HashSet<Integer>>();
		int lineCount = 0;
		while(true) {
			String line = r.readLine();
			// 파일을 다 읽은 상황
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] elements = line.split("\t");
			int from = Integer.parseInt(elements[0]);
			int to=Integer.parseInt(elements[1]);
			list.add(new Email(from, to));
			if(!toSet.containsKey(from)) {
				HashSet<Integer> t=new HashSet<Integer>();
				t.add(to);
				toSet.put(from,t);
			}
		}
		for(Email email : list) {
			if(email.getFrom()==93285)
				from9.add(email.getTo());
		}
		System.out.println(from9.size());
		for(Email email : list) {
			if(from9.contains(email.getFrom()))
				fromfrom9.add(email.getTo());
		}
		System.out.println(fromfrom9.size());
		
		r.close();

    }
}
