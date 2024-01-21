package goorm.PRO1;

import java.io.IOException;
import java.math.BigInteger;

public class PRO1_173089 {
	public static void main(String[] args) throws IOException{
		System.out.println(solution(new BigInteger("10")));
		System.out.println(solution(new BigInteger("-12")));
		System.out.println(solution(new BigInteger("0")));
	}
	public static long solution(BigInteger n) {
		return n.toString().length();
	}
	public static long len(int n) {
		return String.valueOf(n).length();
	}
}
