package algorigsm;

import java.util.Scanner;

public class BOJ_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[sc.nextInt()];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		for(int i = 0;i<arr.length;i++) {
			int cnt = 0; // 누적 합
			int sum = 0; // 총합
			for(int j  = 0;j<arr[i].length();j++) { // 배열의 인덱스 안의 문자 하나씩 비교
				if(arr[i].charAt(j)=='O') {
					cnt+=1; // O면 누적합 증가
				}else { // X면 누적합 0으로 초기화
					cnt = 0;
				}
				sum+=cnt; // 누적합 총합에 누적 저장
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
