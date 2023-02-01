package BOJ;

import java.util.Scanner;

public class BOJ_2775 {
	public static void main(String[] args) {
		int[][] apt = new int[15][15];
		for(int i = 0;i<apt.length;i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		for(int i = 1;i<apt.length;i++) {
			for(int j = 2;j<apt.length;j++) {
				apt[i][j] = apt[i][j-1]+apt[i-1][j];
			}
		}
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		while(t-->0) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			sb.append(apt[k][n]+"\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
