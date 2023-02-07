package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1010 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int answer;
		for(int i = 0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			answer = 1;
			for(int j = 0;j<n;j++) {
				answer = answer *(m-j)/(j+1);
			}
			System.out.println(answer);
		}

	}

}
