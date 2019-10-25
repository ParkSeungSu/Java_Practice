package kr.ac.halla.h02404.Algori;

import java.util.Arrays;
import java.util.Random;

public class practiceHeap {
	private static int N;
	public static void sort(int arr[]) {
		heapify(arr);
		for(int i=N;i>0;i--) {
			System.out.println("힙구성");
			swap(arr, 0, i);
			N=N-1;
			maxheap(arr, 0);
			System.out.println("힙 소트 진행");
			for(int j=0;j<=N;j++) {
				System.out.printf("%4d",arr[j]);
			}
			System.out.println();
		}
		System.out.println("정렬 결과");
		System.out.println("   "+Arrays.toString(arr));
	}
	public static void heapify(int arr[]) {
		System.out.println("힙구성");
		N=arr.length-1;
		for(int i= N/2;i>=0;i--) {
			maxheap(arr, i);
		}
		
	}
	public static void maxheap(int arr[], int i) {
		for(int j=0;j<=N;j++) {
			System.out.printf("%4d",arr[j]);
		}
		System.out.println();
		int left=2*i;
		int right=2*i+1;
		int max=i;
		if(left<=N&&arr[left]>arr[i])
			max=left;
		if(right<=N&&arr[right]>arr[max])
			max=right;
		if(max!=i) {
			swap(arr,i,max);
			maxheap(arr, max);
		}
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		Random radom=new Random();
		int size=radom.nextInt(12)+3;
		int[] data=new int[size];
		System.out.println("배열 순서");
		for(int i=0;i<size;i++)
			System.out.printf("%4d",i);
		System.out.println();
		System.out.println("초기 배열");
		for(int i=0;i<size;i++) {
			data[i]=radom.nextInt(100);
			System.out.printf("%4d",data[i]);
		}System.out.println();
		sort(data);
	}
}
