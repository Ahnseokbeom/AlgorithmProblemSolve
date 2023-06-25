package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_11441 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int a = 1;a<=n;a++) {
			arr[a] = arr[a-1]+Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int b =0;b<m;b++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			sb.append(arr[j]-arr[i-1]+"\n");
		}
		System.out.println(sb);

	}

}
