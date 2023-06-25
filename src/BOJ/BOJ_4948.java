package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int count = 0;
			int n = Integer.parseInt(br.readLine()); // n �Է�
			if(n==0) break;
			for(int i = n+1;i<=n*2;i++){
				if(prime(i)==true) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i = 2;i<=Math.sqrt(n+1);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
