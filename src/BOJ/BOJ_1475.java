package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1475 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[1000001];
		Arrays.fill(list, 0);
		
		while(n!=0) {
			list[n%10] +=1;
			n/=10;
		}
		double max = 0;
		int key = 0;
		for(int i = 0;i<list.length;i++) {
			if(max < list[i]) {
				max = list[i];
				key = i;
			}
		}
		if(key == 9) {
			System.out.println(Math.round(max/2));
		}else {
			System.out.println((int)max);
		}
	}

}
