package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		int n = 0;
		for(int i = 1; ;i++) {
			if(sum>s) break;
			sum +=i;
			n++;
		}
		System.out.println(n-1);
	}
}
