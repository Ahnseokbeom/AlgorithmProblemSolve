package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2407 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long result = dic(n,m);
		System.out.println(result);
	}
	public static long dic(int n, int m) {
		if(m==0 || n==m) {
			return 1;
		}
		return dic(n-1,m-1)+dic(n-1,m);
	}

}
