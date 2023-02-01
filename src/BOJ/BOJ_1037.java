package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int result = 0;
		for(int i = 0;i<n;i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		if(list.length==1) {
			result = list[0]*list[0];
		}else {
			result = list[0]*list[list.length-1];
		}
		sc.close();
		System.out.println(result);
	}

}
