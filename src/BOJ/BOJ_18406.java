package BOJ;

import java.util.Scanner;

public class BOJ_18406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		int lsum = 0;
		int rsum = 0;
		int length = s.length()/2;
		for(int i = 0;i<s.length();i++) {
			if(i<length) {
				lsum += s.charAt(i)-'0';
			}else {
				rsum += s.charAt(i)-'0';
			}
		}
		if(lsum == rsum) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		sc.close();
	}
}
