package CodingTest;

import java.util.Scanner;

public class BOJ_25191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = ((a/2)+b);
		if(sum > n) {
			System.out.println(n);
		}else {
			System.out.println(sum);
		}
		sc.close();
	}

}
