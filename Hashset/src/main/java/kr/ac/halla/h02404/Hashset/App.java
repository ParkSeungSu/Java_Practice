package kr.ac.halla.h02404.Hashset;

import java.util.HashSet;

public class App 
{
    public static void main( String[] args )
    {
       //어떠한 자료들을 집합의 형태로 유지하는 HashSet
      //정수들을 갖고있는 hashset
    	HashSet<Integer> set = new HashSet<Integer>();
    	//값을 넣고 빼고 다양한 활동을 할 수 있다.
    	System.out.println("add 3,5,3");
    	System.out.println(set.add(3));
    	System.out.println(set.add(5));
    	System.out.println(set.add(3));
    	System.out.println("remove 3,4");
    	System.out.println(set.remove(3));
    	System.out.println(set.remove(4));
    	System.out.println("size");
    	System.out.println(set.size());
    	System.out.println("contains");
    	System.out.println(set.contains(5));
    	System.out.println(set.contains(3));
    	
    }
}
