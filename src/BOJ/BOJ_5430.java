package BOJ;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_5430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i = 0;i<T;i++) {
			String P = sc.next();
			int n = sc.nextInt();
			String arr = sc.next();
			Deque<Integer> q = new LinkedList<>();
			for(String s : arr.substring(1, arr.length()-1).split(",")) {
				if(!s.equals("")) {
					q.offer(Integer.valueOf(s));
				}
			}
			System.out.println(AC(q,P));
		}
		sc.close();
	}
	static String AC(Deque<Integer> q, String s) {
		boolean reverse = false;
		for(char c : s.toCharArray()) {
			if(c == 'R') {
				reverse = !reverse;
			}else {
				if(q.size()==0) {
					return "error";
				}
				if(reverse == true) {
					q.removeLast();
				}else {
					q.removeFirst();
				}
			}
		}
		StringBuilder sb = new StringBuilder("[");
		while(!q.isEmpty()) {
			sb.append(reverse ? q.removeLast() : q.removeFirst());
			if(q.size()!=0) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
