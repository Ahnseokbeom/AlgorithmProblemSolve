package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17298 {
	static int n;
	static Stack<Integer> stack = new Stack<Integer>();
	static int[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		list = new int[n];

		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			list[i] = num;
		}
		sc.close();
		solution();
		StringBuilder sb = new StringBuilder();

		for(int i = 0;i<list.length;i++) {
			sb.append(list[i]).append(" ");
		}
		System.out.println(sb);
	}
	public static void solution() {
		for(int i = 0;i<n;i++) {
			while(!stack.isEmpty() && list[stack.peek()]<list[i]) {
				list[stack.pop()] = list[i];
				}
			stack.push(i);
			}
		while(!stack.isEmpty()) {
			list[stack.pop()] = -1;
		}
	}
}
