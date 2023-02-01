package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �����佺�׳׽��� ü
1. 2���� �Ҽ��� ���ϰ��� �ϴ� ������ ��� ���� �����Ѵ�.
2. �Ҽ��� �Ǵ� ���� ����� ����� ���� ���� �Ҽ��� �ȴ�
3. �ڱ� �ڽ��� ������ 2�� ����� ��� �����.
4. ���� �ִ� �� ��� 3�� �Ҽ��̹Ƿ� �����ʿ� 3�� ����.
5. �ڱ� �ڽ��� ������ 3�� ����� ��� �����.
6. ���� �ִ� �� ��� 5�� �Ҽ��̹Ƿ� �����ʿ� 5�� ����.
7. �ڱ� �ڽ��� ������ 5�� ����� ��� �����.
8. �� ������ �ݺ��Ѵ�.*/

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
			while(true) { // �� �� �Ҽ��� ��
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
		prime[0] = prime[1] = true; // 0�� 1�� �Ҽ��� �ƴ�
		
		for(int i = 2;i<Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j = i*i;j<prime.length;j+=i) {
				prime[j] = true; // �Ҽ��� �ƴ�
			}
			
		}
	}

}
