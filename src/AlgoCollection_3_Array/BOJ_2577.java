package AlgoCollection_3_Array;

import java.util.Scanner;

public class BOJ_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a*b*c;
		String s = Integer.toString(mul);
		int[] list = new int[10];
		for(int i = 0;i<s.length();i++) {
			list[s.charAt(i)-'0']++;
		}
		for(int i = 0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}

}
