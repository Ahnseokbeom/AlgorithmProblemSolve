package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_7795 {
	static int[] arrA, arrB;
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			arrA = new int[n];
			arrB = new int[m];
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0;i<n;i++) arrA[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0;i<m;i++) arrB[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(arrB);
			int answer = 0;
			for(int i = 0;i<n;i++) {
				answer +=Search(arrA[i]);
			}
			System.out.println(answer);
		}
	}
	private static int Search(int x) {
		int count = 0;
		int left = 0;
		int right = m-1;
		while(left<=right) {
		int mid = (left+right)/2;
		if(x>arrB[mid]) {
			left = mid+1;
			count = mid+1;
			}else {
				right = mid-1;
			}
		}
		return count;
	}

}
