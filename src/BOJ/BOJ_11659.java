package BOJ;

import java.util.Scanner;

public class BOJ_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for(int a = 0;a<n;a++) {
			arr[a] = sc.nextInt();
		}
		for(int b = 0;b<m;b++) {
			int sum = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			for(int c = i-1;c<j;c++) {
				sum+=arr[c];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
