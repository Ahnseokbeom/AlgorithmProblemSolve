package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2444 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int j =1;
		for(int i = 0;i<n;i++) {
			arr.add(j);
			j+=2;
		}
		StringBuilder sb = new StringBuilder();
		for(int a = 1;a<=n;a++) {
			for(int b = 0;b<n-a;b++) {
				sb.append(" ");
			}
			for(int c = 0;c<arr.get(a-1);c++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int a = n-1;a>=1;a--) {
			for(int b = 0;b<n-a;b++) {
				sb.append(" ");
			}
			for(int c = arr.get(a-1);c>0;c--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
