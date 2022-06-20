package AlgoCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		int[] list = new int[n];
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(list[i]<x) {
				System.out.print(list[i]+" ");
			}
		}
	}

}
