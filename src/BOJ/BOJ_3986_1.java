package BOJ;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;

public class BOJ_3986_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0;i<n;i++) {
			Stack<Character> stack = new Stack<Character>();
			String str = br.readLine();
			for(int j = 0;j<str.length();j++) {
				char c = str.charAt(j);
				if(stack.size()==0) {
					stack.push(c);
				}else if(stack.peek().equals(c)) {
					stack.pop();
				}else {
					stack.push(c);
				}
			}
			if(stack.size()==0) count++;
		}
		System.out.println(count);
	}

}
