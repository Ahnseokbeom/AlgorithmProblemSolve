package AlgoCollection_3_Array;

import java.util.Scanner;

public class BOJ_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<n;i++) {
			list[i] = sc.nextInt();
			if(list[i]>max) {
				max = list[i];
			}
			if(list[i]<min) {
				min = list[i];
			}
		}
		System.out.println(min+" "+max);
		sc.close();
	}

}
