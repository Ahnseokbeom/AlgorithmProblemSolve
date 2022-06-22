package AlgoCollection_5_String;

import java.util.Scanner;

public class BOJ_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			sum++;
			if(i>=1) {
			if(s.charAt(i)=='j') {
				if(s.charAt(i-1)=='n' ||s.charAt(i-1)=='l') {
					sum--;
				}
			}else if(s.charAt(i)=='=') {
				if(i>=2 && s.charAt(i-1)=='z' && s.charAt(i-2)=='d') {
					sum-=2;
				}else {
					sum--;
				}
			}else if(s.charAt(i)=='-') {
				sum--;
				}
			}else {
				continue;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
