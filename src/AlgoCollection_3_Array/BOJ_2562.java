package AlgoCollection_3_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int num = 0;
		for(int i = 1;i<=9;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n>max) {
				max = n;
				num = i;
			}
		}
		System.out.println(max+"\n"+num);
	}

}
