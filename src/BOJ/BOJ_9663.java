package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663 {
	static int n; // 체스판의 크기
	static int[] list; // 체스판
	static int count = 0; // 경우의 수
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new int[n];
		NQeen(0); // 0번째 인덱스부터(열)부터 시작
		System.out.println(count);

	}
	public static void NQeen(int x) {// index = 열 / value = 행
		//행을 다 채우면 경우의 수 1증가
		if(x == n) {
			count++;
			return;
		}else {
			for(int i = 0;i<n;i++) { // 해당 열에서 i번째 행에 퀸을 놓을 수 있는지 검사
				list[x] = i;
				if(check(x)) {
					NQeen(x+1);
				}
			}
		}
	}
	public static boolean check(int y) { // 퀸을 놓을수 있는지 체크하는 함수
		for(int i = 0;i<y;i++) { // 해당 열의 행과 열이 일치하는 경우(false)
			if(list[y]==list[i]) {
				return false;
			//대각선은 x좌표-y좌표의 절대값이 list[x]-list[y]절대값과 같으면 false
			}else if(Math.abs(y-i) == Math.abs(list[y]-list[i])) {
				return false;
			}
		}
		return true;
	}
}
