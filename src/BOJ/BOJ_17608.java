package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17608 {
	public static void main(String[] args) throws IOException{
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		for(int i = 0;i<n;i++) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		int standard = stack.pop();
		int current = 0;
		while(!stack.isEmpty()) {
			current = stack.pop();
			if(current > standard) {
				standard = current;
				count++;
			}
		}
		System.out.println(count);
	}

}
