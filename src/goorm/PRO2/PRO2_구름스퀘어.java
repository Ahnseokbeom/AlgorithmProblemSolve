package goorm.PRO2;

import java.util.Arrays;
import java.util.Comparator;

public class PRO2_구름스퀘어 {
	public static void main(String[] args) {
		System.out.println(solution(6, new int[][] {{1,2},{2,3},{3,6},{4,5},{1,10},{11,13}}));
		System.out.println(solution(7, new int[][] {{1,2},{3,3},{3,5},{4,10},{5,6},{7,9},{10,11}}));
	}
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		Event[] event = new Event[n];
		for(int i = 0;i<n;i++) event[i] = new Event(arr[i][0],arr[i][1]);
		Arrays.sort(event,Comparator.comparing(events -> events.end));
		int time = 0;
		for(Event e : event) {
			if(e.start >= time) {
				answer++;
				time = e.end+1;
			}
		}
		return answer;
	}
	static class Event{
		int start;
		int end;
		Event(int start, int end) {
			this.start=start;
			this.end=end;
		}
	}
}
