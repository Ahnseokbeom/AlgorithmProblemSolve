package goorm.PRO3;

import java.util.Stack;

public class PRO3_stack {
	static StringBuilder sb;
	static Stack<Integer> stack;
	public static void main(String[] args){
		System.out.println(solution(10, 3, new String[] {"push 1","push 6","push 5","pop","pop","pop","push 4","push 4","push 3","pop"}));
		System.out.println(solution(5, 3, new String[] {"pop","push 4","push 9","push 9","push 2"}));
	}
	public static String solution(int n, int k, String[] arr) {
		stack = new Stack<>();
		sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			String[] str = arr[i].split(" ");
			if(stack.size()==k && str[0].equals("push")) sb.append("Overflow\n");
			if(stack.isEmpty() && str[0].equals("pop")) sb.append("Underflow\n");
			if(stack.size() < k && str[0].equals("push")) stack.add(Integer.parseInt(str[1]));
			if(!stack.isEmpty() && str[0].equals("pop")) sb.append(stack.pop()+"\n");
		}
		return sb.toString();
	}

}
