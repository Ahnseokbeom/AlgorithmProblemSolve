package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken()); // 배열의 크기
		int m = Integer.parseInt(str.nextToken()); // 반복할 횟수
		
		int arr[] = new int[n+1]; // 배열 생성
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int a = 1;a<=n;a++) { // 배열의 토큰 추가
			arr[a] = arr[a-1]+Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder(); // 빌더 생성
		for(int a = 0;a<m;a++) { // 구간합 빌더에 저장
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			sb.append(arr[j]-arr[i-1]+"\n");
		}
		System.out.println(sb); // 구간합 출력
	}

}
