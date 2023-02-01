package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24552 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int left = 0;
		int right = 0;
		int answer = 0;
		for(int i = 0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='(') {
				left += 1;
				answer += 1;
			}
			if(s.charAt(i)==')') {
				right +=1;
				answer -= 1;
			}
			if(answer == 0) left = 0;
		}
		System.out.println(answer<0?right:left);
	}
}
