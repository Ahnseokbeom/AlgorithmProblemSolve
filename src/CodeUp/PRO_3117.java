package CodeUp;

import java.util.Stack;

public class PRO_3117 {
	static Stack<Integer> stack = new Stack<>();
	static int sum = 0;
	public static void main(String[] args) {
		System.out.println(solution(10, new int[] {1,3,5,4,0,0,7,0,0,6}));
	}
	public static int solution(int n, int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(stack.isEmpty() || arr[i] != 0) stack.push(arr[i]);
			else stack.pop();
		}
		if(stack.isEmpty())sum = 0;
		else while(!stack.isEmpty()) sum+=stack.pop();
		return sum;
	}


}
