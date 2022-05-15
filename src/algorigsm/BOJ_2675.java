package algorigsm;

import java.util.Scanner;

public class BOJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스 갯수
		
			for(int i = 0;i<t;i++) { // 테스트케이스만큼 반복
				int r = sc.nextInt(); // 문자 반복 횟수 입력
				String str = sc.next(); // 문자열 입력
				for(int j = 0;j<str.length();j++) { // 문자열 길이만큼 반복
					for(int k = 0;k<r;k++) { // 문자 반복 횟수만큼 반복
						System.out.print(str.charAt(j)); // 문자 출력
					}
			}
			System.out.println(); // 줄바꿈
		}	
		sc.close();	
	}

}
