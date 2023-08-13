package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<list.length;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0;i<n;i++) {
			while(!stack.isEmpty() && list[stack.peek()]<list[i]) {
				list[stack.pop()] = list[i];
				}
			stack.push(i);
			}
		while(!stack.isEmpty()) {
			list[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.length;i++) {
			sb.append(list[i]).append(" ");
		}
		System.out.println(sb);
	}
}
