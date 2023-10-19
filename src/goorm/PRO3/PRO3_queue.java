package goorm.PRO3;

import java.util.LinkedList;
import java.util.Queue;

public class PRO3_queue {
	static StringBuilder sb;
	static Queue<Integer> q;
	public static void main(String[] args){
		System.out.println(solution(10, 3, new String[] {"push 1","push 6","push 5","pop","pop","pop","push 4","push 4","push 3","pop"}));
		System.out.println(solution(5, 3, new String[] {"pop","push 4","push 9","push 9","push 2"}));
	}
	public static String solution(int n, int k, String[] arr) {
		q = new LinkedList<>();
		sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			String[] str = arr[i].split(" ");
			if(q.size()==k && str[0].equals("push")) sb.append("Overflow\n");
			if(q.isEmpty() && str[0].equals("pop")) sb.append("Underflow\n");
			if(q.size() < k && str[0].equals("push")) q.add(Integer.parseInt(str[1]));
			if(!q.isEmpty() && str[0].equals("pop")) sb.append(q.poll()+"\n");
		}
		return sb.toString();
	}
}
