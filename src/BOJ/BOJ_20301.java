package BOJ;

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
		int n = Integer.parseInt(st.nextToken()); // 수
		int k = Integer.parseInt(st.nextToken()); // 순열
		int m = Integer.parseInt(st.nextToken()); // 바뀌는 곳
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1;i<=n;i++) {
			q.offer(i);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(q.size()!=0) { // q의 크기가 0이 아닐때까지 반복
			if(q.size()==n-m) { // q의 크기가 반전(N-M)과 같다면 역순으로 배치
				int result = q.poll();
				q.offer(q.poll());
				q.offer(result);
			}
			for(int i = 0;i<k-1;i++) { // k-1만큼 삭제
				q.offer(q.poll());
			}

			list.add(q.poll()); // k번째 수 삭제하면서 list에 삽입
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.size();i++) { // 출력
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}

}
