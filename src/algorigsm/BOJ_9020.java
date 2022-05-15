package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 에라토스테네스의 체
1. 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
2. 소수가 되는 수의 배수를 지우면 남은 건은 소수만 된다
3. 자기 자신을 제외한 2의 배수를 모두 지운다.
4. 남아 있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다.
5. 자기 자신을 제외한 3의 배수를 모두 지운다.
6. 남아 있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다.
7. 자기 자신을 제외한 5의 배수를 모두 지운다.
8. 위 과정을 반복한다.*/

public class BOJ_9020 {
	public static boolean[] prime = new boolean[10001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		prime();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int first = n/2;
			int second = n/2;
			while(true) { // 둘 다 소수일 때
				if(!prime[first] && !prime[second]) {
					sb.append(first).append(" ").append(second).append("\n");
					break;
				}
				first--;
				second++;
			}
		}
		System.out.println(sb);
	}
	public static void prime() {
		prime[0] = prime[1] = true; // 0과 1은 소수가 아님
		
		for(int i = 2;i<Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j = i*i;j<prime.length;j+=i) {
				prime[j] = true; // 소수가 아님
			}
			
		}
	}

}
