package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());
		int result = 1000-cost;
		int[] arr = {500,100,50,10,5,1};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(result/arr[i] > 0) {
				sum += result/arr[i];
				result = result%arr[i];
			}
		}
		System.out.println(sum);
	}

}
