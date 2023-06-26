package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
	public static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		Arrays.sort(arr);

		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<m;i++) {
			sb.append(BinarySearch(Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.println(sb);
	}

	public static int BinarySearch(int key) {
		int left = 0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(key < arr[mid]) {
				right = mid-1;
			}
			else if(key > arr[mid]) {
				left = mid+1;
			}else {
				return 1;
			}
		}
		return 0;
	}

}
