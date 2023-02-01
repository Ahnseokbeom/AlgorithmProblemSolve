package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			LinkedList<int[]> q = new LinkedList<int[]>();
			st = new StringTokenizer(br.readLine());

			for(int i = 0;i<n;i++) {
				q.offer(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			int count = 0;

			while(!q.isEmpty()) {
				int[] front = q.poll();
				boolean max = true;

				for(int i = 0;i<q.size();i++) {
					if(front[1] < q.get(i)[1]) {
						q.offer(front);
						for(int j = 0;j<i;j++) {
							q.offer(q.poll());
						}
						max = false;
						break;
					}
				}
				if(max==false) {
					continue;
				}
				count++;
				if(front[0]==m) break;

			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}
