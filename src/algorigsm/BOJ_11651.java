package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11651 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] list = new int[n][2];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list, (a1, a2) -> {
			if(a1[1] == a2[1]) { // y가 동일하다면
				return a1[0] - a2[0]; // 0번째 인덱스 오름차순 정렬(양수이면 교환 음수이면 그대로)
			} else {
				return a1[1] - a2[1]; // 0번을 기준으로 오름차순 정렬
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.length;i++) {
			sb.append(list[i][0]+" "+list[i][1]).append("\n");
		}
		System.out.println(sb);
		
	}

}
