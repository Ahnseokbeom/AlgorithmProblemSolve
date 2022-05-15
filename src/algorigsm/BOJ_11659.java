package algorigsm;

import java.util.Scanner;

// 구간 합 구하기 -- 시간초과(실패)
public class BOJ_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 배열 크기 입력
		int m = sc.nextInt(); // 반복 횟수 입력
		int[] arr = new int[n]; // 배열 초기화
		
		for(int a = 0;a<n;a++) { // 배열의 각 인덱스에 값 입력
			arr[a] = sc.nextInt();
		}
		for(int b = 0;b<m;b++) { // 반복할 구간 입력
			int sum = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			for(int c = i-1;c<j;c++) { // 반복되는 구간의 정수값을 더해준다
				sum+=arr[c];
			}
			System.out.println(sum); // 합 출력
		}
		sc.close();
	}

}
