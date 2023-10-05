package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO_소수찾기 {
	static int n, answer;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws Exception{
		n = Integer.parseInt(br.readLine());
		answer = 0;
		System.out.println(solution());
	}
	public static boolean prime(int n){
		if(n==0 || n==1) return false;
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static int solution() throws IOException{
		st = new StringTokenizer(br.readLine());
		for(int i = 1;i<=n;i++){
			int number = Integer.parseInt(st.nextToken());
			if(prime(i)) answer+=number;
		}
		return answer;
	}
}
