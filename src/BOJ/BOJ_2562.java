package BOJ;

import java.util.Scanner;

public class BOJ_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE;
		int n = 0;
		for(int i = 0;i<9;i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				n = i+1;
			}
		}
		sc.close();
		System.out.println(max+"\n"+n);
	}

}
