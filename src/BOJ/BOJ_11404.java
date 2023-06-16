package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11404 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][n+1];
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) arr[i][j] = 100000001;
			arr[i][i] = 0;
		}
		StringTokenizer st;
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if(arr[S][E] > C) arr[S][E] = C;
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				for(int k = 1;k<=n;k++) {
					if(arr[j][k] > arr[j][i] + arr[i][k]) arr[j][k] = arr[j][i] + arr[i][k];
				}
			}
		}
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(arr[i][j]==100000001) sb.append("0 ");
				else sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
