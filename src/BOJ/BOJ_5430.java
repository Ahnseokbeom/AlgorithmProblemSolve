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
			// arr�迭�� 1�� �ε������� arrũ��-1��ŭ ","�������� s�� �ִ´�(��ȣ ����)
			for(String s : arr.substring(1, arr.length()-1).split(",")) { 
				if(!s.equals("")) { // ������ �ƴϸ� s�� ť�� ����
					q.offer(Integer.valueOf(s));
				}
			}
			System.out.println(AC(q,P)); // AC�Լ� ���
		}
		sc.close();
	}
	static String AC(Deque<Integer> q, String s) { // AC�Լ��� R�� D�� �������ִ� �Լ�
		boolean reverse = false;
		for(char c : s.toCharArray()) { // String s�� char[]�� �ٲ� ���� c�� �ϳ��� �ִ´� - ex) RDD R / D / D
			if(c == 'R') {
				reverse = !reverse;
			}else {
				if(q.size()==0) { // ť�� ũ�Ⱑ 0�̸� error ���
					return "error";
				}
				if(reverse == true) {
					q.removeLast(); // �� �޺κ� ����
				}else {
					q.removeFirst(); // �� �� �κ� ����
				}
			}
		}
		StringBuilder sb = new StringBuilder("[");
		while(!q.isEmpty()) {
			sb.append(reverse ? q.removeLast() : q.removeFirst()); // reverse�� true�̸� last false�̸� first
			if(q.size()!=0) { // 0�� �ƴϸ� , �߰�
				sb.append(",");
			}
		}
		sb.append("]"); // �������� �ݴ� ��ȣ �߰�
		return sb.toString();
	}
}
