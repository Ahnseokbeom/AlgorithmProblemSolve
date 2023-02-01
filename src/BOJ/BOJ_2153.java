package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2153 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int sum = 0;
		for(int i = 0;i<word.length();i++) {
			char c = word.charAt(i);
			if(c >= 'A' && c <= 'Z') {
                sum += c - 38;
            } else if (c >= 'a' && c <= 'z') {
                sum += c - 96;
            }
		}
		if(prime(sum)) {
			System.out.println("It is a prime word.");
		}else {
			System.out.println("It is not a prime word.");
		}

}
	public static boolean prime(int n) {
		if(n<2){
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i = 2;i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
