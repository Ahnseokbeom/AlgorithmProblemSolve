package BOJ;

import java.util.Scanner;

public class BOJ_10808 {
	public static void main(String[] args) {
		int[] arr = new int[26];
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0;i<s.length();i++) {
			arr[s.charAt(i)-97]++;
		}
		sc.close();
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
