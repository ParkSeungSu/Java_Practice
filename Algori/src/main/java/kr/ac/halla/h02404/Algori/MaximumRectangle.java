package kr.ac.halla.h02404.Algori;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {

	static int findMaxArea(int l, int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int max_area = 0;
        for (int i = 0; i < l; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int top_height = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max_area = Math.max(max_area, w * top_height);
                System.out.println("top_height : "+top_height+" w : "+w+" == "+max_area);
            }
            stack.push(i);
        }
        return max_area;
    }

    static int maximalRectangle(int[][] matrix) {
        int n = matrix.length;
        int m = n == 0 ? 0 : matrix[0].length;
        int[][] memo = new int[n][m + 1];

        // initialize
        // first row
        for (int i = 0; i < m; i++) {
            memo[0][i] = matrix[0][i] == 1 ? 1 : 0;
        }
        System.out.println(Arrays.toString(memo[0])+"\t"+Arrays.toString(matrix[0]));
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    memo[i][j] = memo[i - 1][j] + 1;
                } else {
                    memo[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(memo[i])+"\t"+Arrays.toString(matrix[i]));
        }

        // find max
        int max = 0;
        for (int i = 0; i < n; i++) {
        	if(max<findMaxArea(m+1, memo[i]))
        			max = findMaxArea(m + 1, memo[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };
        System.out.println(maximalRectangle(matrix));
    }

}
