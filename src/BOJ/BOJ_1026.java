package BOJ;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class BOJ_1026 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // A,B�� ũ��
		int[] A = new int[n];
		int[] B = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0;i<n;i++) {
			answer += A[i]*B[n-1-i];
		}
		System.out.println(answer);
		
	}
}
