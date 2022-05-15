package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_20301 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); // ��
		int k = Integer.parseInt(st.nextToken()); // ����
		int m = Integer.parseInt(st.nextToken()); // �ٲ�� ��
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1;i<=n;i++) {
			q.offer(i);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(q.size()!=0) { // q�� ũ�Ⱑ 0�� �ƴҶ����� �ݺ�
			if(q.size()==n-m) { // q�� ũ�Ⱑ ����(N-M)�� ���ٸ� �������� ��ġ
				int result = q.poll(); 
				q.offer(q.poll());
				q.offer(result);
			}
			for(int i = 0;i<k-1;i++) { // k-1��ŭ ����
				q.offer(q.poll());
			}

			list.add(q.poll()); // k��° �� �����ϸ鼭 list�� ����
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.size();i++) { // ���
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
