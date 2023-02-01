package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		int num = 0;
		for(int i = 0;i<n;i++) {
			num = sc.nextInt();
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		sc.close();
		
		for(int a :stack) {
			sum+=a;
		}
		System.out.println(sum);
	}

}
