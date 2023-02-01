package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11054 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] list = new int[a];
		// 정방향
		int[] result1 = new int[a];
		// 역방향
		int[] result2 = new int[a];
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<a;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0;i<a;i++) {
			result1[i] = 1;
			for(int j = 0;j<i;j++) {
				if(list[j]<list[i] && result1[i]<=result1[j]) {
					result1[i] = result1[j]+1;
				}
			}
		}
		for(int i = a-1;i>=0;i--) {
			result2[i] = 1;
			for(int j = a-1;j>=i;j--) {
				if(list[j]<list[i] && result2[i]<=result2[j]) {
					result2[i] = result2[j]+1;
				}
			}
		}
		for(int i = 0;i<a;i++) {
			result = Math.max(result, result1[i]+result2[i]);
		}
		// 5가 겹치기 때문에 -1을 해줘야 한다
		System.out.println(result-1);
	}

}
