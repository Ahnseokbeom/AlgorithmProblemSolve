package BOJ;

import java.util.Scanner;

public class BOJ_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		while(true) {
			if(n%5==0) {
				sum+=n/5;
				System.out.println(sum);
				break;
			}else {
				n -= 3;
				sum++;
			}
			if(n<0) {
				System.out.println(-1);
				break;
			}
		}
		sc.close();
	}

}
