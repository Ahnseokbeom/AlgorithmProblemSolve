package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int sum = b+c;
		if(sum % 60 == 0) {
			a+=sum/60;
			b = sum - (sum/60)*60;
		}else if(sum > 60) {
			a+=sum/60;
			b = sum - (sum/60)*60;
		}else {
			b = sum;
		}
		if(a>=24) {
			a -=24;
		}

		System.out.println(a+" "+b);
	}

}
