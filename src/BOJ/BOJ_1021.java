package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		// 크기
		int n = Integer.parseInt(st.nextToken());
		// 뽑아낼 수
		int m = Integer.parseInt(st.nextToken());
		LinkedList<Integer> q = new LinkedList<>();
		int result = 0;
		for(int i = 1;i<=n;i++) {
			q.offer(i);
		}
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());
			int a = q.indexOf(num);
			if(q.indexOf(num)<=q.size()/2) {
				for(int j = 0;j<a;j++) {
					q.addLast(q.removeFirst());
					result++;
				}
			}else {
				for(int k = 0;k<q.size()-a;k++) {
					q.addFirst(q.removeLast());
					result++;
				}
			}
			if(num==q.peekFirst()) {
				q.remove();
			}
		}
		System.out.println(result);

	}

}
