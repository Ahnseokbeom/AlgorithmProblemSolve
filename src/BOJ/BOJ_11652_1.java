package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11652_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] list = new long[n];
		for(int i = 0;i<n;i++) {
			list[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(list);
		int count = 1, max = 1, maxId = 0;
		for(int i = 1;i<n;i++) {
			if(list[i]==list[i-1]) count++;
			else count = 1;
			if(count > max) {
				max = count;
				maxId = i;
			}
		}
		System.out.println(list[maxId]);
	}

}
