package goorm.PRO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRO2_195690 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		while(n!=0) {
			if(n>=14) {
				answer+=n/14;
				n = n-(n/14)*14;
			}
			if(n>=7) {
				answer+=n/7;
				n = n-(n/7)*7;
			}
			if(n>0 && n < 7) {
				answer+=n;
				n = 0;
			}
		}
		System.out.println(answer);
	}

}
