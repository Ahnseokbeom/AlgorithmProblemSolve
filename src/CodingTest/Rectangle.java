package CodingTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Rectangle {
	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
		Queue<Integer> q = new LinkedList<>();
		q.offer(v[0][0]);
		for(int i = 1;i<3;i++) {
			if(q.isEmpty()&&i==2) {
				break;
			}
			if(q.peek()==v[i][0]) {
				q.poll();
			}else q.offer(v[i][0]);
		}
		if(q.isEmpty()) {
			answer[0] = v[2][0];
		}else answer[0] = q.poll();
		q.clear();
		q.offer(v[0][1]);
		for(int i = 1;i<3;i++) {
			if(q.isEmpty()&&i==2) {
				break;
			}
			if(q.peek()==v[i][1]) {
				q.poll();
			}else q.offer(v[i][1]);
		}
		if(q.isEmpty()) answer[1] = v[2][1];
		else answer[1] = q.poll();
		return answer;
	}
	public static void main(String[] args) {
		int[][] v1 = {{1,4},{3,4},{3,10}};
		int[][] v2 = {{1,1},{2,2},{1,2}};
		System.out.println("v1 : "+Arrays.toString(solution(v1)));
		System.out.println("v2 : "+Arrays.toString(solution(v2)));
	}

}
