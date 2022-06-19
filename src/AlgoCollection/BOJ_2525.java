package AlgoCollection;

import java.util.Scanner;

public class BOJ_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = b+c;
		System.out.println(b);
		if(sum%60==0) {
			a = b/60;
			b = 0;
		}else if(sum>=60) {
			b = b-60;
			a+=1;
		}else {
			b = sum;
		}
		if(a>=24) {
			a = a-24;
		}
		System.out.println(a+" "+b);
		sc.close();
	}

}
