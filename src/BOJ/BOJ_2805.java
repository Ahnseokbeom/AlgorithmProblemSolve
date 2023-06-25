package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2805 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		int max = 0;
		int min = 0;
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(max < list[i]) max = list[i];
		}
		while(min < max) {
			int mid = (min+max)/2;
			long sum = 0;
			for(int height : list) {
				if(height - mid > 0) {
					sum+=height-mid;
				}
			}
			if(sum < m) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}

}
