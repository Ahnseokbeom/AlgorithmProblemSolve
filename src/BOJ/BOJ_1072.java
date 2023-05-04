package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1072 {
	static long x,y,z;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		z = y*100/x;
		if(z >= 99) System.out.println(-1);
		else binary(0,x);
	}
	public static void binary(long left, long right) {
		while(left <= right) {
			long mid = (left+right)/2;
			if(z<100*(y+mid)/(x+mid)) {
				right = mid-1;
			}else left = mid+1;
		}
		System.out.println(left);
	}
}
