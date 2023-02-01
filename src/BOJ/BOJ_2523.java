package BOJ;

import java.util.Scanner;

public class BOJ_2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n*2-1;
		for(int i = 1;i<=x;i++) {
			if(i<=n) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}else {
				for(int k = 0;k<=x-i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();

	}

}
