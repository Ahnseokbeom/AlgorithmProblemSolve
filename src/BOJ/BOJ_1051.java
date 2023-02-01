package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1051 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];

		for(int i = 0;i<n;i++) {
			String temp = br.readLine();
			for(int j = 0;j<m;j++) arr[i][j] = temp.charAt(j)-'0';
		}

		int answer = 1;
		int size = Integer.min(n, m);
		for(int s = 2;s<=size;s++) {
			for(int i = 0;i<n-s+1;i++) {
				for(int j = 0;j<m-s+1;j++) {
					if(arr[i][j]==arr[i+s-1][j] && arr[i][j]==arr[i][j+s-1] &&
							arr[i][j]==arr[i+s-1][j+s-1]) {
						if(answer < s) answer = s;
					}

				}
			}
		}
		System.out.println((int)(Math.pow(answer, 2)));
	}

}
