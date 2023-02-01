package BOJ;

import java.util.Scanner;

public class BOJ_2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			int j = 0;
			for(j = 0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<n-j;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1;i<=n-1;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=n-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
