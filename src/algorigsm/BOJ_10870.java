package algorigsm;

import java.util.Scanner;

public class BOJ_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n 입력
		System.out.println(fibo(n)); // n값의 피보나치 출력
		sc.close();
	}
	public static int fibo(int n) { //피보나치 함수
		int result = 0; // 출력값
		if(n == 0) return result; // 0이면 0 리턴
		if(n == 1) { // 1이면 1 리턴
			result = 1;
			return result;
		}
		if(n >= 2) { // 2이상이면 전값과 전전값의 합 리턴
			result = fibo(n-2)+fibo(n-1);
			return result;
		}
		return result;
	}

}
