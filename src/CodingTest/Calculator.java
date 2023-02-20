package CodingTest;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		int num = 10;
		if(x > num) {
			while(true) {
				if(x < num) break;
				num*=10;
			}
		}
		System.out.println(x+" "+num);
		System.out.println(num/x);
		sc.close();
	}

}
