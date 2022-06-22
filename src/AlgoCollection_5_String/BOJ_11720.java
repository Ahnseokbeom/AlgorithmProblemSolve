package AlgoCollection_5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = null;
		int sum = 0;
		while(true) {
			s = br.readLine();
			if(s.length()==n) break;
		}
		for(int i = 0;i<s.length();i++) {
			int num = s.charAt(i)-'0';
			sum+=num;
		}
		System.out.println(sum);
	}

}
