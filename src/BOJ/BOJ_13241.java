package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		System.out.println(max(a,b));
	}
	//	최대 공약수
	static long min(long a, long b) {
		while(b!=0){
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	//최소  공배수
	static long max(long a, long b) {
		return (a*b) / min(a,b);
	}
}
