package AlgoCollection_2_For;

import java.util.Scanner;

public class BOJ_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<=n;i++) {
			for(int j = 0;j<n-i;j++) {
				sb.append(" ");
			}
			for(int k = 0;k<i;k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();

	}

}
