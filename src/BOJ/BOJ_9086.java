package BOJ;

import java.util.Scanner;

public class BOJ_9086 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			String s = sc.next();
			sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
		}
		sc.close();
		System.out.println(sb);
	}

}
