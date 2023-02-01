package BOJ;

import java.util.Scanner;

public class BOJ_1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] arr = new String[n];

		for(int i = 0;i<n;i++) {
			arr[i] = sc.next();
		}
		boolean check;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr[0].length();i++) {
			char c = arr[0].charAt(i);
			check = true;
			for(int j = 1;j<n;j++) {
				if(c!=arr[j].charAt(i)) {
					check = false;
					break;
				}
			}
			if(check) sb.append(arr[0].charAt(i));
			else sb.append("?");
		}
		System.out.println(sb);
		sc.close();

	}
}



