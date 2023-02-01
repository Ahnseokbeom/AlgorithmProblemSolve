package BOJ;

import java.util.Scanner;

public class BOJ_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tempa = a-((a/100)*100)+((a%10)*100)-a%10+a/100;
		int tempb = b-((b/100)*100)+((b%10)*100)-b%10+b/100;
		if(tempa<tempb) {
			System.out.println(tempb);
		}else {
			System.out.println(tempa);
		}
		sc.close();
		
	}

}
