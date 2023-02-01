package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2446 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int j = (n*2)-1;
		for(int i = 0;i<n;i++) {
			arr.add(j);
			j-=2;
		}
		System.out.println(arr);
		StringBuilder sb = new StringBuilder();
		for(int a = 0;a<arr.get(0);a++) {
			sb.append("*");
		}
		sb.append("\n");
		for(int a = 1;a<n;a++) {
			for(int b = 0;b<(arr.get(0)-arr.get(a))/2;b++){
				sb.append(" ");
			}
			for(int c = 0;c<arr.get(a);c++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		Collections.sort(arr);
		for(int a = 1;a<n;a++) {
			for(int b = 0;b<(arr.get(arr.size()-1)-arr.get(a))/2;b++) {
				sb.append(" ");
			}
			for(int c = 0;c<arr.get(a);c++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
