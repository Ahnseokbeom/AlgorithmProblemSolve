package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
 * 2부터 N까지 모든 정수를 적는다.
아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.*/
public class BOJ_2960 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[n+1];
		
		int count = 0;
		
		for(int i = 2;i<=n;i++) {
			prime[i] = true;
		}
		for(int i = 2;i<=n;i++) {
			for(int j = i;j<=n;j+=i) {
				if(!prime[j]) continue;
				prime[j] = false;
				count++;
				if(count==k) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
		
	}

}
