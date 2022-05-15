package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		int[] list =  new int[n];
		for(int i = 1;i<=n;i++) {
			q.add(i);
		}
		int i = 0;
		while(q.size() != 1) { // q의 사이즈가 1이 아닐때까지
			list[i++] = q.poll(); // list[i]에 q의 첫번째 값 넣고 삭제
			q.offer(q.poll()); // q의 그 다음 값 삭제 후 맨 뒤로 넣기
		}
		StringBuilder sb = new StringBuilder();
		
		for(i = 0;i<list.length;i++) {
			if(i== list.length-1) { // 마지막이면 Queue의 있는 마지막 값 출력
				sb.append(q.peek()).append(" ");
			}else { // 마지막이 아니면 list 안의 값 출력
				sb.append(list[i]).append(" ");
			}
		}
		System.out.println(sb);
	}

}
