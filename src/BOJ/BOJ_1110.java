package BOJ;

import java.util.Scanner;

public class BOJ_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int answer = n;
		int result = 0;
		int count = 0;
		while(true) {
			result = n%10;
			n /=10;
			temp = (result*10)+(n+result);
			if(n+result>=10) temp -=10;
			n = temp;
			count++;
			if(answer == n) break;
		}
		sc.close();
		System.out.println(count);
	}

}
