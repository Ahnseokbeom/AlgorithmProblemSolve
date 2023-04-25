package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {
	static int n;
	static int k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		long[] arr = new long[k];
		long right = 0;
		long answer = 0;
		for(int i = 0;i<k;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			right = Math.max(right, arr[i]);
		}
		answer = search(arr, n, right);
		System.out.println(answer);
	}
	public static long search(long arr[], int n, long right) {
		long mid = 0;
		long left = 1;
		while(left <= right) {
			mid = (left+right)/2;
			long sum = 0;
			for(int i = 0;i<k;i++) sum += arr[i]/mid;
			if(sum >= n) left = mid+1;
			else right = mid-1;
		}
		return right;
	}

}
