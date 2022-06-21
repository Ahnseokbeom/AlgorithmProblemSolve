package AlgoCollection_3_Array;

import java.util.Scanner;

public class BOJ_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = Integer.MIN_VALUE;
		double sum = 0;
		double[] list = new double[n];
		for(int i = 0;i<n;i++) {
			list[i] = sc.nextInt();
			if(list[i]>max) max = list[i];
		}
		for(int i = 0;i<n;i++) {
			list[i] = (list[i]/max)*100;
			sum += list[i];
		}
		System.out.println(sum/n);
		sc.close();
	}

}
