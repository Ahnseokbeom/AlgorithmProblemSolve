package BOJ;

import java.util.Scanner;

public class BOJ_2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)>=97) {
				char a = (char) (s.charAt(i)-32);
				sb.append(a);
			}else {
				char a = (char) (s.charAt(i)+32);
				sb.append(a);
			}
		}
		sc.close();
		System.out.println(sb);
	}

}
