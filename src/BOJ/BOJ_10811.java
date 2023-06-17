package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		for(int i = 1;i<=n;i++) arr[i] = i;
		for(int i = 1;i<=m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			tmp(a,b);
		}
		for(int i = 1;i<=n;i++) System.out.printf("%d ",arr[i]);
	}
	public static void tmp(int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}

}
