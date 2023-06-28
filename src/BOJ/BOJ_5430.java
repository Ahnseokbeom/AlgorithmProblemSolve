package BOJ;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_5430 {
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			String p = sc.next();
			int n = sc.nextInt();
			String arr = sc.next();
			Deque<Integer> dq = new LinkedList<>();
			for(String s : arr.substring(1, arr.length()-1).split(",")) {
				if(!s.equals("")) {
					dq.offer(Integer.valueOf(s));
				}
			}
			AC(dq,p);
			System.out.println(sb);
		}
		sc.close();
	}
	static StringBuilder AC(Deque<Integer> dq, String s) {
		sb = new StringBuilder();
		boolean reverse = false;
		for(char c : s.toCharArray()) {
			if(c == 'R') {
				reverse = !reverse;
			}else {
				if(dq.size()==0) {
					sb.append("error");
					return sb;
				}
				if(reverse) {
					dq.removeLast();
				}else {
					dq.removeFirst();
				}
			}
		}
		sb.append("[");
		while(!dq.isEmpty()) {
			sb.append(reverse ? dq.removeLast() : dq.removeFirst());
			if(dq.size()!=0) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb;
	}
}
