package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13900 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Long[] num = new Long[n+1];
		Long[] sum = new Long[n+1];
		num[0] = 0L;
		sum[0] = 0L;
		for(int i = 1;i<=n;i++) {
			num[i] = Long.parseLong(st.nextToken());
			sum[i] = num[i]+sum[i-1];
		}
		Long answer = 0L;
		for(int i = 2;i<=n;i++) {
			answer+=num[i]*sum[i-1];
		}
		System.out.println(answer);
	}

}
