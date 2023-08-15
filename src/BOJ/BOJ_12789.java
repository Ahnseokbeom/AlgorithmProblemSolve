package BOJ;

import java.util.Stack;

public class BOJ_12789 {
	static int num = 1;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		System.out.println(solution(new int[] {5,4,1,3,2}));
		System.out.println(solution(new int[] {5,1,3,4,2}));
	}
	public static String solution(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==num)num++;
			else stack.push(arr[i]);
		}
		while(true) {
			if(stack.peek()==num) {
				num++;
				stack.pop();
			}
			if(stack.isEmpty() || stack.peek()!=num) break;
		}
		if(stack.isEmpty()) return "Nice";
		else return "Sad";
	}
}
