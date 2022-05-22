package CodingTest;

import java.util.Scanner;

public class BOJ_25192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		String copy = "abcdsacsadwsacsdwsacs";
		for(int i = 0;i<n;i++) {
			String s = sc.next();
			if(s.equals(copy)) {
				continue;
			}else if(s.equals("ENTER")) {
				continue;
			}else {
				result++;
			}
			copy = s;
		}
		sc.close();
		System.out.println(result);
	}

}
