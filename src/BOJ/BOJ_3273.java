package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int left = 0;
		int right = n-1;
		int mid = 0;
		int answer = 0;
		while(left < right) {
			mid = arr[left]+arr[right];
			if(mid == x) answer++;
			if(mid <= x) left++;
			else right--;
		}
		System.out.println(answer);
	}

}
