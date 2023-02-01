package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1914 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		BigInteger result = new BigInteger("1");
		if(n<=20) {
			hanoi(n,1,2,3);
			sb.insert(0, (int)(Math.pow(2, n)-1)+"\n");
			System.out.print(sb);
		}else {
			for(int i = 0;i<n;i++) {
				result = result.multiply(new BigInteger("2"));
			}
			result = result.subtract(new BigInteger("1"));
			System.out.println(result);
		}
	}
	public static void hanoi(int n, int from, int mid, int to) {
		if(n==1) {
			sb.append(from+" "+to).append("\n");
		}else {
			hanoi(n-1,from,to,mid);
			sb.append(from+" "+to).append("\n");
			hanoi(n-1,mid,from,to);
		}
	}
}
