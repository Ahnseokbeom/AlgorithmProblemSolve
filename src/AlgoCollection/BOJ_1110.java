package AlgoCollection;

import java.util.Scanner;

public class BOJ_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = n;
		int count = 0;
		int sum = 0;
		while(true) {
			sum = (result%10)+(result/10);
			if(sum>=10) sum = sum-10;
			result = ((result%10)*10)+sum;
			count++;
			if(result==n) break;
		}
		System.out.println(count);
		sc.close();
	}

}
