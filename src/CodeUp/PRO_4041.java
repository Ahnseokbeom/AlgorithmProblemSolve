package CodeUp;

import java.util.Stack;

public class PRO_4041 {
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static int sum = 0;
	public static void main(String[] args) {
		int n = 6008;
		solution(n);
		System.out.println(sb);
		System.out.println(sum);
	}
	public static void solution(int n) {
		String s = String.valueOf(n);
		for(int i = 0;i<s.length();i++) stack.push(s.charAt(i)-'0');
		while(!stack.isEmpty()) {
			if(stack.peek()==0) stack.pop();
			else{
				int num = stack.pop();
				sb.append(num);
				sum+=num;
			}
		}
	}
}
