package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10986 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum = 0;
		int count[] = new int[1001];
		long res = 0;
		st = new StringTokenizer(br.readLine()," ");
		while(n-->0) {
			int num = Integer.parseInt(st.nextToken());
			sum+=num;
			sum%=m;
			res +=count[sum];
			count[sum]++;
			if(sum==0) res++;
		}
		System.out.println(res);
	}

}
