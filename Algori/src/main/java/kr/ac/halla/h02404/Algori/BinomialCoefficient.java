package kr.ac.halla.h02404.Algori;

public class BinomialCoefficient {

	public static void main(String[] args) {
		int n = 5;
		int k = 10;
		System.out.printf(" n: %d / k: %d / bin: %d", n, k, binomial(n+1, k+1));

	}

	static int binomial(int n, int k) {
		int i, j;
		int[][] B = new int[n][k];

		for (i = 0; i <= n - 1; i++) {
			for (j = 0; j <= (i <= k - 1 ? i : k - 1); j++) {
				// 3항 연산자 i가 k-1보다 작다면 i 아니면 k-1
				if (j == 0 || j == i) {
					B[i][j] = 1;
				} else {
					B[i][j] = B[i - 1][j - 1] + B[i - 1][j];
				}
			}
		}

		// 배열 출력
		for (i = 0; i < n; i++) {
			for (j = 0; j < k; j++) {
				System.out.print(B[i][j] + "\t");
			}
			System.out.println();
		}
		return B[n - 1][k - 1];
	}
}
