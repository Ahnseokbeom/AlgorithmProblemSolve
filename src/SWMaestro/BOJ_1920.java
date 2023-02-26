package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class BOJ_1920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] A = new int[n];
		for(int i = 0;i<n;i++) A[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		Arrays.sort(A);
		int[] B = new int[m];
		for(int i = 0;i<m;i++) B[i] = Integer.parseInt(st.nextToken());
		for(int i = 0;i<B.length;i++) {
			if(search(B[i],A)>0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}

	}
	private static int search(int n,int[] A) {
		int left = 0;
		int right = A.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(A[mid] > n) {
				right = mid-1;
			}else if(A[mid] < n) {
				left = mid+1;
			}else return 1;
		}
		return -1;
	}

}
