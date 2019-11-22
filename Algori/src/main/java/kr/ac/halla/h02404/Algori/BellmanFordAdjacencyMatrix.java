package kr.ac.halla.h02404.Algori;

import java.util.*;
import java.util.stream.Collectors;

public class BellmanFordAdjacencyMatrix {

	private int n, start;
	private boolean solved;
	private double[] dist;
	private Integer[] prev;
	private double[][] matrix;

//	Bellman-Ford 알고리즘의 구현.
//	알고리즘은 시작 노드와 그래프에서 다른 모든 노드 사이의 최단 경로를 찾는다.
//	이 알고리즘은 또한 음의 주기를 감지한다. 노드가 음의 사이클의 일부인 경우, 
//	해당 노드의 최소 비용은 이중으로 설정된다.NEGATIVE_INFINITY.

	/*
	 * graph - 그래프를 형성하는 가중치 간선들을 가진 인접행렬 start - 시작 노드의 id
	 */
	public BellmanFordAdjacencyMatrix(int start, double[][] matrix) {
		this.n = matrix.length;
		this.start = start;
		this.matrix = new double[n][n];

		// 인자로 전달받은 인접행렬 을 복사한다.
		for (int i = 0; i < n; i++)
			this.matrix[i] = matrix[i].clone();
	}

	public double[] getShortestPaths() {
		if (!solved)
			solve();
		return dist;
	}

	public List<Integer> reconstructShortestPath(int end) {
		if (!solved)
			solve();
		LinkedList<Integer> path = new LinkedList<>();
		if (dist[end] == Double.POSITIVE_INFINITY)
			return path;
		for (int at = end; prev[at] != null; at = prev[at]) {
			// 최단 경로 수가 무한하므로 null을 반환합니다.
			if (prev[at] == -1)
				return null;
			path.addFirst(at);
		}
		path.addFirst(start);
		return path;
	}

	public void solve() {
		if (solved)
			return;

		// 시작 노드가 0인 경우를 제외하고 모든 노드까지의 거리를 무한대로 초기화

		dist = new double[n];
		java.util.Arrays.fill(dist, Double.POSITIVE_INFINITY);
		dist[start] = 0;

		// 알고리즘이 종료 된 루 가장 짧은 경로 재구성이 가능한 prev 배열을 초기화
		prev = new Integer[n];

		// 각 정점에 대해 모든 간선에 변경 적용
		for (int k = 0; k < n - 1; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (dist[i] + matrix[i][j] < dist[j]) {
						dist[j] = dist[i] + matrix[i][j];
						prev[j] = i;
					}

//		어느 노드가 음의 사이클의 일부인지를 탐지하기 위해 
//		두 번째 알고리즘을 실행합니다.
//		최적의 해를 넘어 더 나은 경로를 찾을 수 있다면 음의 사이클이 발생한다.
		for (int k = 0; k < n - 1; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (dist[i] + matrix[i][j] < dist[j]) {
						dist[j] = Double.NEGATIVE_INFINITY;
						prev[j] = -1;
					}

		solved = true;
	}

	private static void printArray(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j < a[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(5) + 3;
		double[][] graph = new double[n][n];

		// 노드에서 자기자신 까지의 거리가 0인 상태에서 완전히 연결이 끊어진 그래프를 설정합니다.
		for (int i = 0; i < n; i++) {
			java.util.Arrays.fill(graph[i], Double.POSITIVE_INFINITY);
			graph[i][i] = 0;
		}

		int e = r.nextInt(n) + 8;
		int count = 0;
		int pi = 0;
		int pj = 0;
		while (true) {
			if (count == n)
				break;
			else {
				int i = r.nextInt(n);
				int j = r.nextInt(n);
				int val = r.nextInt(19) - 9;
				if (i == j)
					continue;
				if (pi == i && pj == j)
					continue;
				if (val == 0)
					continue;
				pi = i;
				pj = j;
				graph[i][j] = val;
				count++;
			}

		}
		printArray(graph);

		for (int start = 0; start < n; start++) {
			BellmanFordAdjacencyMatrix solver;
			solver = new BellmanFordAdjacencyMatrix(start, graph);
			double[] d = solver.getShortestPaths();
			for (int i = 0; i < n; i++)
				System.out.printf("The cost to get from node %d to %d is %.2f\n", start, i, d[i]);

			for (int i = 0; i < n; i++) {
				String strPath;
				List<Integer> path = solver.reconstructShortestPath(i);
				if (path == null) {
					strPath = "Infinite number of shortest paths.";
				} else {
					List<String> nodes = path.stream().map(Object::toString).collect(Collectors.toList());
					strPath = String.join(" -> ", nodes);
				}
				System.out.printf("The shortest path from %d to %d is: [%s]\n", start, i, strPath);
			}

			System.out.println();

		}
	}
}