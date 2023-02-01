package BOJ;

import java.util.Scanner;

public class BOJ_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String s = sc.next();
		sc.close();
		
		for(int i = 0;i<s.length();i++) {
			if(65<=s.charAt(i) && s.charAt(i)<=90) {
				arr[s.charAt(i)-65]++;
			}else {
				arr[s.charAt(i)-97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int j = 0;j<26;j++) {
			if(arr[j]>max) {
				max = arr[j];
				ch = (char)(j+65);
			}else if(arr[j]==max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		
		
	}

}
