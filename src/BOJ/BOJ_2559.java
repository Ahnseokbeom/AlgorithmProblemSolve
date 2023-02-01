package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2559 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k =Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<=n-k;i++) {
			int sum = 0;
			for(int j = i;j<i+k;j++) {
				sum +=list[j];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);

	}

}
