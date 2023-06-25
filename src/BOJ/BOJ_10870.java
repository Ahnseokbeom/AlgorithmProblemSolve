package BOJ;

import java.util.Scanner;

public class BOJ_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
		sc.close();
	}
	public static int fibo(int n) {
		int result = 0;
		if(n == 0) return result;
		if(n == 1) {
			result = 1;
			return result;
		}
		if(n >= 2) {
			result = fibo(n-2)+fibo(n-1);
			return result;
		}
		return result;
	}

}
