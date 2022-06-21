package AlgoCollection_3_Array;

import java.util.Scanner;

public class BOJ_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		while(c-->0) {
			int sum = 0;
			double avg = 0;
			double count = 0;
			int n = sc.nextInt();
			int[] list = new int[n];
			for(int i = 0;i<n;i++) {
				list[i] = sc.nextInt();
				sum+=list[i];
			}
			avg = sum/n;
			for(int i = 0;i<n;i++) {
				if(list[i]>avg) count++;
			}
			System.out.printf("%.3f%%",(count/n)*100);
			System.out.println();
		}
		sc.close();
	}

}
