package BOJ;

import java.io.IOException;
import java.util.Stack;

public class BOJ_11899 {
	static Stack<Character> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
		System.out.println(solution(")))()"));
		stack.clear();

		System.out.println(solution(")(()"));
		stack.clear();

		System.out.println(solution("))()(("));
		stack.clear();

		System.out.println(solution(")(()(()))"));
	}
	public static int solution(String s) {
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==')' && stack.isEmpty()) sum++;
			else if(s.charAt(i)=='(') stack.push(s.charAt(i));
			else stack.pop();
		}
		return stack.size()+sum;
	}

}
