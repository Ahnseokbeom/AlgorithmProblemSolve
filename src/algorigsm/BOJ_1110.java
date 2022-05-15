package algorigsm;

import java.util.Scanner;

public class BOJ_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정수 입력
		int temp = 0; // 바뀌는 값
		int answer = n; // 정수의 본래 값 
		int result = 0; // 1의 자리
		int count = 0; // 반복 횟수
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
