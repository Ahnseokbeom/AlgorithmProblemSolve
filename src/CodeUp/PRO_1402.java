package CodeUp;

import java.util.Stack;

public class PRO_1402 {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		Input(5,new int[] {1,3,5,6,8});
		Print();
	}
	public static void Input(int n, int[] arr) {
		for(int i = 0;i<arr.length;i++) stack.push(arr[i]);
	}
	public static void Print() {
		while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
	}

}
