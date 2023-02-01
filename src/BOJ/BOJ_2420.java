package BOJ;

import java.util.Scanner;

public class BOJ_2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long result = N + (M *-1);
		System.out.println(Math.abs(result));
		sc.close();
	}

}
