package kr.ac.halla.h02404.Algori;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//Java program 1로만 이루어진 가장 큰 사각형 찾기
//배열 안에서
public class RectangleSize {
	static int W;
	static int H;
	static int col;

	// 표시된 히스토그램에서 최대 영역을 찾는다
	private static int maxHist(int R, int C, int row[]) {
		// 빈 스택을 만든다. 이 스택은 배열의 hist(히스토그램 배열) array를 가진다.
		// 스택에 저장된 막대(히스토그램)은 항상 높이 순서가 증가한다??\
		Stack<Integer> result = new Stack<Integer>();
		int top_val; // 스택의 꼭대기
		int max_area = 0; // 현재 열(히스토그램)의 최대 크기를 초기화
		int area = 0; // 현재 꼭대기에서 부터의 면적을 초기화
		int weight = 0;
		// 주어진 히스토그램 (또는 행)의 모든 막대를 통과합니다.
		int i = 0;
		while (i < C) {
			// 만약 막대가 스택의 꼭대기에 저장되어 있는 막대보다 크다면
			// 이 막대를 꼭대기에 push
			if (result.empty() || row[result.peek()] <= row[i])
				result.push(i++);
			else {
				// 이 막대가 스택 상단보다 낮은 경우
				// 스택 상단이 가장 작은 (또는 최소 높이) 막대 인 사각형 영역을 계산하십시오.
				// 'i'는 상단에 대한 '오른쪽 인덱스'이고
				// 스택의 맨 앞에있는 요소는 '왼쪽 인덱스'입니다.
				top_val = row[result.peek()];
				result.pop();
				weight = i;
				area = top_val * weight;
				if (!result.isEmpty()) {
					weight = (i - result.peek() - 1);
					area = top_val * weight;
				}
				if (area > max_area) {
					max_area = area;
					H = top_val;
					W = weight;
					col = i;
				}
			}
		}
		// 이제 스택에 남아있는 막대들을 pop하고, 모든 pop된 막대들을 가장 작은 막대로 면적을 계산?
		while (!result.isEmpty()) {
			top_val = row[result.peek()];
			result.pop();
			weight = i;
			area = top_val * weight;
			if (!result.isEmpty()) {
				weight = (i - result.peek() - 1);
				area = top_val * weight;
			}
			if (area > max_area) {
				max_area = area;
				H = top_val;
				W = weight;
				col = i;
			}
		}
		return max_area;
	}

	// 배열 A[][] 에서 1로 이루어진 가장큰 사각형 영역을 반환한다.

	private static int maxRectangle(int R, int C, int A[][]) {
		// 첫번째 열의 영역을 계산하고 이것을 result에 초기화 한다.
		int result = maxHist(R, C, A[0]);
		System.out.println(Arrays.toString(A[0]) + ":" + result + " 가로 :" + W + " 세로 : " + H);
		// 각 행을 히스토그램으로 고려하여 최대 직사각형 영역을 찾기 위해 행을 순회
		for (int i = 1; i < R; i++) {
			for (int j = 0; j < C; j++) {
				// 만약A[i][j]가 1이면 A[i-1][j]를 더한다.
				if (A[i][j] == 1)
					A[i][j] += A[i - 1][j];
			}
			int temp = maxHist(R, C, A[i]);
			if (temp > result) {
				result = temp;
				System.out.println(Arrays.toString(A[i]) + "area:" + result + " 세로길이:" + H + " 가로길이 : " + W + " From("
						+ (i - H + 1) + "," + (col - W) + ")");
			} else {
				System.out.println(Arrays.toString(A[i]));
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Random random = new Random();
		int R = random.nextInt(26) + 5;
		int C = random.nextInt(26) + 5;

		int A[][] = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				A[i][j] = random.nextInt(2);
			}
			System.out.println(Arrays.toString(A[i]));
		}
		System.out.println(A.length);
		System.out.println(A[1].length);
		System.out.println("Area of maximum rectangle is " + maxRectangle(R, C, A));

	}

}
