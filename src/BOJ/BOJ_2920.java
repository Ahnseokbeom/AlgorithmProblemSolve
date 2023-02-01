package BOJ;

import java.util.Scanner;

public class BOJ_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] str = new int[8];
		String s = "";
		for(int i = 0;i<8;i++) {
			str[i] = sc.nextInt();
		}
		for(int i = 0;i<str.length-1;i++) {
			if(str[i+1]==str[i]+1) {
				s = "ascending";
			}else if(str[i+1]==str[i]-1) {
				s = "descending";
			}else {
				s = "mixed"; break;
			}
		}
		System.out.println(s);
		sc.close();
	}

}
