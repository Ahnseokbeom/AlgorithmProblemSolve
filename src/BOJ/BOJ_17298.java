package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17298 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int[] list = new int[n];
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			list[i] = num;
		}
		sc.close();
		for(int i = 0;i<n;i++) {
			while(!stack.isEmpty() && list[stack.peek()] < list[i]) {
				list[stack.pop()] = list[i];
			}
			stack.push(1);
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
