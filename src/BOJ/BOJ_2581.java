package BOJ;

import java.util.Scanner;

public class BOJ_2581 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		int min = 0;

		for(int i = m;i<=n;i++) {
				int j = 2;
				for(;j<n;j++) {
					if(i%j==0)
						break;
				}
				if(j==i) {
					sum += j;
					if(min != 0) {
						continue;
					}else min = j;
				}
			}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
		}
}


