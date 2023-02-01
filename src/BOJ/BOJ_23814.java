package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_23814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long d = Long.parseLong(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		// 짜장면
		long n = Long.parseLong(st.nextToken());
		// 짬뽕
		long m = Long.parseLong(st.nextToken());
		// 남은 사람 수
		long k = Long.parseLong(st.nextToken());
		while(k%d!=0) {
			if((n%d)+1==d) {
				k--;
				n++;
				if(k%d==0) {
					break;
				}
			}else if((m%d)+1==d) {
				m++;
				k--;
				if(k%d==0) {
					break;
				}
			}else if(k%d!=0) {
				k--;
			}
		}
		System.out.println(k);
	}

}
