package CodeUp;

import java.util.Scanner;

public class PRO_3704 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(5));
	}
	public static int solution(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;
		return (solution(n-1)+solution(n-2)+solution(n-3))%1000;
	}

}
