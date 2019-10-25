package kr.ac.halla.h02404.Algori;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class PracticeRect1 {
	static int H;
	static int W;
	static int col;
	public static int maxHist(int R,int C, int row[]) {
		Stack<Integer> result = new Stack<Integer>();
		int top_val=0;
		int area=0;
		int max_area=0;
		int weith=0;
		int i=0;
		while(i<C) {
			if(result.empty()||row[result.peek()]<=row[i])
				result.push(i++);
			else {
				top_val=row[result.peek()];
				result.pop();
				weith=i;
				area=top_val*weith;
				if(!result.isEmpty()) {
					weith=(i-result.peek()-1);
					area=top_val*weith;
				}
				if(area>max_area) {
					max_area=area;
					H=top_val;
					W=weith;
					col=i;
				}
			}
		}
		while(!result.isEmpty()) {
			top_val=row[result.peek()];
			result.pop();
			weith=i;
			area=top_val*weith;
			if(!result.isEmpty()) {
				weith=(i-result.peek()-1);
				area=top_val*weith;
			}
			if(area>max_area) {
				max_area=area;
				H=top_val;
				W=weith;
				col=i;
			}
		}
		return max_area;
	}
	public static int maxRectangle(int R,int C,int A[][]) {
		int result=maxHist(R, C, A[0]);
		System.out.println(Arrays.toString(A[0])+ " area: "+result+ " 세로 size:"+H+" 가로 size:"+W+"  from("+(0-H+1)+","+(col-W)+")");
		for(int i=1; i<R;i++) {
			for(int j=0;j<C;j++) {
				if(A[i][j]==1)
					A[i][j]+=A[i-1][j];
			}
			int temp=maxHist(R, C, A[i]);
			if(temp>result) {
				result=temp;
				System.out.println(Arrays.toString(A[i])+ " area: "+result+ " 세로 size:"+H+" 가로 size:"+W+"  from("+(i-H+1)+","+(col-W)+")");
			}else
				System.out.println(Arrays.toString(A[i]));
		}
		return result;
	}
	public static void main(String[] args) {
		Random random= new Random();
		int R=random.nextInt(26)+5;
		int C=random.nextInt(26)+5;
		int A[][]=new int [R][C];
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				A[i][j]=random.nextInt(2);
			}
			System.out.println(Arrays.toString(A[i]));
		}
		System.out.printf("\n\n%2d x %2d 행렬",R,C);
		System.out.println("\n");
		maxRectangle(R, C, A);
	}

}
