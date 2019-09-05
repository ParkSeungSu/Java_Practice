package kr.ac.halla.h02404.App;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App 
{	
	static int[] score=new int[10];
	static Scanner scan;
    public static void main( String[] args )
    {	long y = 100001023l;
    	int x = (int)y;
    	System.out.println(x);
    	scan=new Scanner(System.in);
        System.out.println( "Hello World!" );
        System.out.print("Input your name: ");
        String name=scan.nextLine();
        System.out.println(name);
        System.out.print("Insert your blood type: ");
        String blood=scan.next();
        System.out.println("your blood type is "+blood);
        System.out.println("Insert your Age");
        int age=scan.nextInt();
        System.out.println(age+" years old");
        System.out.println("Insert your favorit 10 numbers");
        for (int i = 0; i < score.length; i++) {
			int sc=scan.nextInt();
			score[i]=sc;
		}
        System.out.print("your lucky number are ");
        for (int i = 0; i < score.length; i++) {
			System.out.print(" "+score[i]);
		}int max=0;
        for (int i:score) {
			if(max<i) {
				max=i;
			}
		}
        System.out.print("\nyour maximum lucky number is : "+max);
        max=0;
        for (int s:score) {
			max+=s;
		}
        System.out.println("\nyour lucky numbers average is : "+max/score.length);
        int alpha=4;
        int beta=2;
        int sx=88;
        System.out.println(sx>=80&& sx<=70);
    }
}
