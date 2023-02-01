package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Hansoo(Integer.parseInt(br.readLine())));
	}
	public static int Hansoo(int n) {
		int count = 0;
		
		if(n < 100) {
			return n;
		}else {
			count = 99;
			if(n == 1000) {
				n = 999;
			}
		}
		for(int i = 100;i<=n;i++) {
			int hun = i / 100;
			int ten = (i/10) % 10;
			int one = i%10;
			
			if((hun-ten)==(ten-one)) {
				count++;
			}
		}
		return count;
	}

}
