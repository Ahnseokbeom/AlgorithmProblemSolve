package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_17176 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		char[] c = new char[n];
		for(int i = 0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num==0) {
				c[i] = ' ';
			}
			if(num>=1 &&num<=26) {
				c[i] = (char)(num+64);
			}
			if(num>=27) {
				c[i] = (char)(num+70);
			}
		}
		System.out.println(Arrays.toString(c));
		String s = br.readLine();
		Queue<Character> q = new LinkedList<Character>();
		for(int i = 0;i<s.length();i++) {
			q.offer(s.charAt(i));
			for(int j = 0;j<c.length;j++) {
				if(q.peek()==c[j]) {
					q.poll();
					break;
				}else {
					continue;
				}
			}
		}
		if(!q.isEmpty()) {
			System.out.println("n");
		}else {
			System.out.println("y");
		}
	}

}
