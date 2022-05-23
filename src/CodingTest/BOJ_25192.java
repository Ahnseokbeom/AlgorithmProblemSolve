package CodingTest;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_25192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		HashSet<String> hs = new HashSet<>();
		while(n-->0) {
			String s = sc.next();
			if(s.equals("ENTER")) {
				hs = new HashSet<>();
				continue;
			}
			if(!hs.contains(s)) {
				hs.add(s);
				result++;
			}
		}
		sc.close();
		System.out.println(result);
	}

}
