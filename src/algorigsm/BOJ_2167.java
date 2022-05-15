package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2167 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] list = new int[n][m];
		for(int a = 0; a<n;a++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int b = 0; b<m;b++) {
				list[a][b] = Integer.parseInt(st.nextToken());
			}
		}
		int k = Integer.parseInt(br.readLine()); // 합을 구할 부분의 개수
		StringBuilder sb = new StringBuilder();
		for(int a = 0;a<k;a++) { // (i,j)부터 (x,y)까지의 합 구하기
			st = new StringTokenizer(br.readLine()," ");
			int sum = 0;
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int b = i-1;b<x;b++) {
				for(int c = j-1;c<y;c++) {
					sum+=list[b][c];
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		
	}

}
