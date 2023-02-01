package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23037 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		while(n>0) {
			int sum = 0;
				sum = (n%10)-(n%1/10);
				result+= Math.pow(sum, 5);
		n = n/10;
		}
		System.out.println(result);
	}

}
