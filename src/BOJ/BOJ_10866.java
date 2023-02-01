package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<n;i++) {
			String[] s = br.readLine().split(" "); // s[0] , s[1]�� ���� ��, push_front 2�̸� push_front = s[0] , 2 = s[1]
			
			switch(s[0]) {
			case "push_front": push_front(Integer.parseInt(s[1])); break;
			case "push_back": push_back(Integer.parseInt(s[1])); break;
			case "pop_front": sb.append(pop_front()).append("\n"); break;
			case "pop_back": sb.append(pop_back()).append("\n"); break;
			case "size": sb.append(size()).append("\n"); break;
			case "empty": sb.append(empty()).append("\n"); break;
			case "front": sb.append(front()).append("\n"); break;
			case "back": sb.append(back()).append("\n"); break;
			}
		}
		System.out.println(sb);
	}
	static int[] Deque = new int[20001];
	static int front = 10000;
	static int size = 0;
	static int back = 10000;
	
	/*Deque�� ���� �տ� �ִ� ���Ҵ� front+1�̴�.
	 * Deque �迭���� front�� ���������� ����Ű�� ��ġ�� �׻� ����д�.
	 * ��, ���� �տ��ִ� ���Ҵ� front + 1�� �ȴ�.
	 * 
	 * ������ ���� front�� ���� ��ġ�� ���Ҹ� �ְ� �Ǹ� ������ ��
	 * ���ܰ� �߻��Ѵ�.
	 * 
	 * ���ε��  push_front(3) �� �����Ϸ� �ϴµ� �ƹ� ���ҵ� ���� ��  
	 * front--; ���ҽ�Ų �� deque[front] = 3; �� �Ǹ�
	 * deque[9999] = 3; �� �ȴ�. �̶� front = 9999; back = 10000 �� �ȴ�.
	 * 
	 * ������, ���Ұ� �� ���� ���� ��� �ش� ���Ҵ� front ���� back ���Ұ� �ȴ�.
	 * �̷��� ��츦 �����ϱ� ����
	 * deque[front] �� ���Ҹ� ���� ��, front--; �� ���ش�.
	 * 
	 * ��������� front ��� ��ü�� deque[front + 1] ��ġ�� �ڸ��Ѵ�.*/
	
	static void push_front(int n) {
		Deque[front] = n;
		size++;
		front--;
	}
	static void push_back(int n) {
		back++;
		Deque[back] = n;
		size++;
		
	}
	static int pop_front() {
		if(size==0) {
			return -1;
		}else {
			int result = Deque[front+1];
			size--;
			front++;
			return result;
		}
	}
	static int pop_back() {
		if(size==0) {
			return -1;
		}else {
			int result = Deque[back];
			size--;
			back--;
			return result;
		}
	}
	static int size() {
		return size;
	}
	static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	static int front() {
		if(size==0) {
			return -1;
		}else {
			return Deque[front+1];
		}
	}
	static int back() {
		if(size==0) {
			return -1;
		}else {
			return Deque[back];
		}
	}

}
