package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630 {
	static int[][] arr;
	static int white = 0;
	static int blue = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		StringTokenizer st;
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<n;j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		search(0, 0, n);
		StringBuilder sb = new StringBuilder();
		sb.append(white).append("\n").append(blue);
		System.out.println(sb);
	}
	private static void search(int x, int y,int n) {
		boolean check = true;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[x][y] != arr[x+i][y+j]) {
					check = false;
					break;
				}
				if(!check) break;
			}
		}
		if(check) {
			if(arr[x][y]==0) white++;
			else blue++;
		}else {
			search(x,y,n/2);
			search(x+n/2,y,n/2);
			search(x,y+n/2,n/2);
			search(x+n/2,y+n/2,n/2);
		}
	}

}
