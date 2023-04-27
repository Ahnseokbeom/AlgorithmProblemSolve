package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9935 {
	static String str;
	static String bomb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		bomb = br.readLine();
		Stack<Character> stack = new Stack<>();

		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			stack.add(c);
			if(stack.size() >= bomb.length()) {
				boolean check = true;
				for(int j = 0;j<bomb.length();j++) {
					char c1 = stack.get(stack.size()-bomb.length()+j);
					char c2 = bomb.charAt(j);
					if(c1!=c2) {
						check = false;
						break;
					}
				}
				if(check) {
					for(int idx = 0;idx<bomb.length();idx++) stack.pop();
				}
			}
		}
		if(stack.size()==0) System.out.println("FRULA");
		else {
			StringBuilder sb = new StringBuilder();
			for(char c : stack) sb.append(c);
			System.out.println(sb.toString());
		}
	}

}
