package BOJ;

import java.util.Scanner;

public class BOJ_10162 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(t>=300) {
			a = t/300;
			t -= 300 * a;
		}
		if(t>=60) {
			b = t/60;
			t-= 60*b;
		}
		if(t%10 != 0) {
			System.out.println(-1);
		}else {
			c = t/10;
			t -= 10*c;
			System.out.println(a +" "+b+" "+c);
		}
		sc.close();
	}
}

