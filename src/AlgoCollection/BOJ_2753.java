package AlgoCollection;

import java.util.Scanner;

public class BOJ_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if(n%4==0 && n%100!=0) {
			sb.append("1");
		}else if(n%400==0) {
			sb.append("1");
		}else {
			sb.append("0");
		}
		System.out.println(sb);
		sc.close();
	}

}
