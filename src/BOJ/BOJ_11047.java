package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
	static int count = 0;
	static int[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(greedy(n, k));
	}
	public static int greedy(int n, int k) {
		for (int i = n - 1; i >= 0; i--) {
			if (list[i] <= k) {
				count += (k / list[i]);
				k = k % list[i];
			}
		}
		return count;
	}
}
