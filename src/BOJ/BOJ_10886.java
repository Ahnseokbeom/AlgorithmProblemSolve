package BOJ;

import java.util.Scanner;

public class BOJ_10886 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cute = new int[2];
		for(int i = 0;i<n;i++) {
			cute[sc.nextInt()]++;
		}
		if(cute[0] > cute[1]) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}
		sc.close();
	}

}
