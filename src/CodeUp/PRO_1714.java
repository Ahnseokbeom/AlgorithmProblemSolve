package CodeUp;

import java.util.Stack;

public class PRO_1714 {
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		int n = 123456;
		String s = String.valueOf(n);
		for (int i = 0; i < s.length(); i++)
			stack.push(s.charAt(i) - '0');
		Print();
	}

	public static void Print() {
		while (!stack.isEmpty())
			System.out.print(stack.pop());
	}

}
