package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] list = new int[n][2];
		for(int i = 0;i<n;i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(list, (a1, a2) -> {
			if(a1[0] == a2[0]) {
				return a1[1] - a2[1];
			} else {
				return a1[0] - a2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			sb.append(list[i][0]+" "+list[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
