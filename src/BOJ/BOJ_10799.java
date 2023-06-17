package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10799 {
	static String s;
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		Stack<Integer> stack = new Stack<>();
		answer(stack);
		System.out.println(result);
		sc.close();
	}
	public static void answer(Stack<Integer> stack) {
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='(') stack.push(i);
			else {
				if(stack.pop()==i-1) result+=stack.size();
				else result+=1;
			}
		}
	}

}
