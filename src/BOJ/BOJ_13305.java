package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13305 {
	public static void main(String[] args) throws IOException{
		System.out.println(solution(4, new long[] {2,3,1}, new long[] {5,2,4,1}));
		System.out.println(solution(4, new long[] {3,3,4}, new long[] {1,1,1,1}));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] km = new long[n-1];
		long[] price = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n-1;i++) km[i] = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) price[i] = Long.parseLong(st.nextToken());
		System.out.println(solution(n, km, price));
	}
	public static long solution(int n, long[] km, long[] price) {
		long sum = 0;
		long min = price[0];
		for(int i = 0;i<km.length;i++) {
			if(price[i] < min) min = price[i];
			sum+=(min*km[i]);
		}
		return sum;
	}

}
