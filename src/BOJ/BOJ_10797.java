package BOJ;

import java.util.Scanner;

public class BOJ_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 0;i<5;i++) {
			int num = sc.nextInt();
			if(num==n) answer++;
		}
		System.out.println(answer);
		sc.close();
	}

}
