package CodeUp;

import java.util.Stack;

public class PRO_1929 {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		solution(5);
		print();
	}
	public static void solution(int n) {
		stack.push(n);
		if(n <= 1) return;
		if(n%2==0) solution(n/2);
		if(n%2!=0) solution(n*3+1);
	}
	public static void print() {
		if(stack.isEmpty()) return;
		System.out.println(stack.pop());
		print();
	}

}
