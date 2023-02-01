package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // �켱������ ���� ���ڼ����� �켱����ť �ʱ�ȭ
		
		for(int i = 0;i<n;i++) {
			int x = Integer.parseInt(br.readLine()); //ť�� ���� ���� �Է�
			if(x != 0) { // �ִ� ���� 0�� �ƴϸ� �켱����ť�� �߰�
				pq.offer(x);
			}
			if(x == 0) { // �ִ� ���� 0�̸� �켱����ť�� �߰��ϰ� �켱������ ���� ���� sb�� �ְ� ����
				pq.offer(x);
				sb.append(pq.poll()).append("\n");
			}
		}
		System.out.println(sb);
	}

}
