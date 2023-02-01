package BOJ;

import java.util.Scanner;

public class BOJ_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i)+"";
		}
		if(s.equals(reverse)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}

}
