package BOJ;

import java.util.Scanner;

public class BOJ_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int n = sc.nextInt();
			int[] list = new int[n];
			double sum = 0;
			for(int j = 0;j<n;j++) {
				int a = sc.nextInt();
				list[j] = a;
				sum+=a;
			}
			double result = sum/n;
			double cnt = 0;
			for(int k = 0;k<n;k++) {
				if(list[k]>result) {
					cnt++;
				}
			}
			sc.close();
			System.out.printf("%.3f%%\n",cnt/n*100);
		}
	}

}
