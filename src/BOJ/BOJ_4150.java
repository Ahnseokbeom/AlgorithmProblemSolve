package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_4150 {
	public static BigInteger fibo(int n) {
		BigInteger a = BigInteger.valueOf(1);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c;
		for(int j =2 ;j<=n;j++) {
			c=a.add(b);
			a=b;
			b=c;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibo(n));
	}

}
