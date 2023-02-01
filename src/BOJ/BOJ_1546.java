package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] list = new double[sc.nextInt()];
		
		for(int i = 0;i<list.length;i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		double sum = 0;
		for(int i = 0;i<list.length;i++) {
			sum+= list[i]/list[list.length-1]*100;
		}
		sc.close();
		System.out.println(sum/list.length);
	}

}
