package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO_159184 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		for(int i = 1;i<=n;i++){
			int number = Integer.parseInt(st.nextToken());
			if(prime(i)) answer+=number;
		}
		System.out.println(answer);
	}
	public static boolean prime(int n){
		if(n==0 || n==1) return false;
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}

}
