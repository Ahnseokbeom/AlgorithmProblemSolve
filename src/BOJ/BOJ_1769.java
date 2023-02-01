package BOJ;

import java.util.Scanner;

public class BOJ_1769 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int count = 0;
		while(x.length()!=1) {
			count++;
			int sum = 0;
			for(int i = 0;i<x.length();i++) {
				sum+=Integer.parseInt(x.charAt(i)+"");
			}
			x = Integer.toString(sum);
		}
		if(Integer.parseInt(x)%3==0) {
			System.out.println(count+"\nYES");
		}else {
			System.out.println(count+"\nNO");
		}
		sc.close();
	}

}
