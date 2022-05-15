package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) { // 무한 반복
			int count = 0; // 소수의 개수를 세줄 변수
			int n = Integer.parseInt(br.readLine()); // n 입력
			if(n==0) break; // n이 0이면 while문 종료
			for(int i = n+1;i<=n*2;i++){ // n+1 ~2n까지의 소수 찾기
				if(prime(i)==true) {
					count++;
				}
			}
			System.out.println(count); // 소수 갯수 출력
		}
	}
	public static boolean prime(int n) { // 소수 구하는 함수
		if(n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i = 2;i<=Math.sqrt(n+1);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
