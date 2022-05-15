package algorigsm;

import java.util.Scanner;

public class BOJ_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 문자열 입력
		sc.close();
		
		for(int i = 0;i<str.length();i++) { // 문자열길이만큼 반복
			System.out.print(str.charAt(i)); // 문자 출력
			if(i%10==9)System.out.println();// 문자 10개씩 끊어서 다음 라인으로 이동
		}
	}

}
