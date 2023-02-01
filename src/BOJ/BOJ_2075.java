package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2075 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n*n];
		StringTokenizer st;
		int num = 0;
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<n;j++) {
				list[num++] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(list);
		System.out.println(list[n*n -n]);
	}

}
