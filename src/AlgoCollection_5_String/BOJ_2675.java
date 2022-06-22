package AlgoCollection_5_String;

import java.util.Scanner;

public class BOJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			int r = sc.nextInt();
			String s = sc.next();
			for(int i = 0;i<s.length();i++) {
				for(int j = 0;j<r;j++) {
					char c = s.charAt(i);
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
