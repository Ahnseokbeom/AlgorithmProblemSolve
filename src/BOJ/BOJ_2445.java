package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2445 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int j = (n-1)*2;
		int num = n*2;
		for(int i = 0;i<n;i++) {
			arr.add(j);
			j-=2;
		}
		StringBuilder sb = new StringBuilder();
		for(int a = 1;a<=n;a++) {
			for(int b = 0;b<(num-arr.get(a-1))/2;b++) {
				sb.append("*");
			}
			for(int c = 0;c<arr.get(a-1);c++) {
				sb.append(" ");
			}
			for(int d = 0;d<(num-arr.get(a-1))/2;d++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		Collections.sort(arr);
		for(int a = 2;a<=n;a++) {
			for(int b = 0;b<(num-arr.get(a-1))/2;b++) {
				sb.append("*");
			}
			for(int c = 0;c<arr.get(a-1);c++) {
				sb.append(" ");
			}
			for(int d = 0;d<(num-arr.get(a-1))/2;d++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
