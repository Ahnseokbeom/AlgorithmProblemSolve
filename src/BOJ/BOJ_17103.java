package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17103 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] num = new boolean[1000001];
		num[0]= num[1] = true;
		for(int i = 2;i<=Math.sqrt(1000000);i++) {
			if(num[i])continue;
			for(int j = i*i;j<=100000;j+=i) num[j] = true;
		}
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int i = 2;i<=n/2;i++) if(!num[i] && !num[n-i]) answer++;
			System.out.println(answer);
		}
	}

}
