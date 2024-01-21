package goorm.PRO1;

import java.math.BigInteger;

public class PRO1_175880 {
	static BigInteger num = new BigInteger("1000000007");
	public static void main(String[] args) {
		System.out.println(fac(3));
		System.out.println(fac(100));
		System.out.println(fac(100000));
	}
	public static BigInteger fac(int n) {
		if(n==0) return BigInteger.ZERO;
		else {
			BigInteger result = BigInteger.ONE;
			for(int i = 1;i<=n;i++) result = result.multiply(BigInteger.valueOf(i)).mod(num);
			return result;
		}
	}
}
