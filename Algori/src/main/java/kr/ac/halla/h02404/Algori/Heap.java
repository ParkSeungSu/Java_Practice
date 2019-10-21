package kr.ac.halla.h02404.Algori;

import java.util.Arrays;
import java.util.Random;

public class Heap {
	private static int N;

    /**
     * Time Complexity: Total n elements, each element calls max heapify once,
     * hence total complexity is (n log n).
     */
    public static void sort(int arr[]) {

        // 힙 구조화
        heapify(arr);

        for (int i = N; i > 0; i--) {
        	System.out.println("힙구성");
            // 힙에서 가장 큰값을 root로 가져온다.
            // 마지막 요소와 스와핑하여 root를 제거
            swap(arr, 0, i);
            N = N - 1;
            // 다시 힙화하여 최대 힙 속성을 유지
            maxheap(arr, 0);
            System.out.println("힙 소트 진행");
            System.out.println("  "+Arrays.toString(arr));
        }
        System.out.println("정렬 결과");
        System.out.println("  "+Arrays.toString(arr));
    }

    /**
     * 힙을 만드는 함수
     */
    public static void heapify(int arr[]) {
    	System.out.println("힙구성");
        N = arr.length - 1;
        // Go from the bottom non-leaf nodes of the binary tree, hence i--.
        // The max non-leaf nodes of a binary tree with n nodes is n/2.
        for (int i = N / 2; i >= 0; i--) 
            maxheap(arr, i);
    }

    /**
     * 힙에서 가장 큰 요소와 바꾸는 함수
     */
    public static void maxheap(int arr[], int i) {

        // 배열 형식의 트리를 나타내며, i의 왼쪽 자식은 2i
        // i의 오른쪽 자식은 2i + 1입니다
        System.out.println("  "+Arrays.toString(arr));
        int left = 2 * i; // i의 왼쪽 자식 주소
        int right = 2 * i + 1; // i의 오른쪽 자식의 주소
        int max = i;

        // 왼쪽 자식 인덱스가 배열의 최대 인덱스보다 작은 경우
        // 그리고 노드 i의 왼쪽 자식이 노드 i보다 크면 max은 왼쪽 자식으로 된다.
        if (left <= N && arr[left] > arr[i])
            max = left;
        // 오른쪽 자식도 비슷하게 
        if (right <= N && arr[right] > arr[max])
            max = right;

        // 왼쪽 또는 오른쪽 아이가 현재 노드보다 큰 경우, 그것을 교체
       // 최대 노드의 서브 트리에서 힙을 유지합니다.
        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    /* 배열에서 두 값을 교체하는 함수 */
    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

 
    public static void main(String[] args) {
    	int[] dat;
    	Random random=new Random();
    	int size=random.nextInt(12)+3;
    	dat=new int[size];
    	System.out.println("정렬전");
    	for(int i=0;i<size;i++)
    		System.out.printf("%4d",i);
    	System.out.println();
    	for(int i=0;i<size;i++) {
    		dat[i]=random.nextInt(100);
    		System.out.printf("%4d",dat[i]);
    	}
    	System.out.println();
    	sort(dat);
    }
}