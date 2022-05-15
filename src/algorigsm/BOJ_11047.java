package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		int count = 0;
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n-1;i>=0;i--) {
			if(list[i]<=k) {
				count+=(k/list[i]);
				k = k % list[i];
			}
		}
		System.out.println(count);
	}

}
