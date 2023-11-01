package Softeer.PRO2;

import java.util.Scanner;

public class PRO2_바이러스 {
	static int mod = 1000000007;
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long k = sc.nextLong();
      long p = sc.nextLong();
      long n = sc.nextLong();
      long answer = k % mod;
      long power = 1;
      for(long i = 1;i<=n;i++) power = (power*p) % mod;
      answer = (answer * power) % mod;
      System.out.println(answer);
    }
}
