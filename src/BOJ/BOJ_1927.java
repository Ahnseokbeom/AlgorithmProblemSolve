package BOJ;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.BufferedReader;

public class BOJ_1927 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // �켱������ ���� ���ڼ�
		for(int i = 0;i<n;i++) {
			int x = Integer.parseInt(br.readLine());
			if(pq.isEmpty() && x==0) { // ť�� ����ְ�, 0���� ������
				pq.offer(x);
				sb.append(pq.poll()).append("\n");
			}else if(x==0) { // ť�� �� ����ִµ� 0�� ������
				sb.append(pq.poll()).append("\n");
			}
			if(x!=0) { // ���� ���� 0�� �ƴϸ�
				pq.offer(x); 
			}
		}
		System.out.println(sb);
	}

}
