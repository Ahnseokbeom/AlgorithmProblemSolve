package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<n;i++) {
			String[] s = br.readLine().split(" "); // s[0] , s[1]을 구분 즉, push_front 2이면 push_front = s[0] , 2 = s[1]
			
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
	
	/*Deque는 가장 앞에 있는 원소는 front+1이다.
	 * Deque 배열에서 front가 최종적으로 가리키는 위치는 항상 비워둔다.
	 * 즉, 가장 앞에있는 원소는 front + 1이 된다.
	 * 
	 * 이유는 만약 front의 최종 위치에 원소를 넣게 되면 다음과 같
	 * 예외가 발생한다.
	 * 
	 * 예로들어  push_front(3) 을 실행하려 하는데 아무 원소도 없을 때  
	 * front--; 감소시킨 뒤 deque[front] = 3; 이 되면
	 * deque[9999] = 3; 이 된다. 이때 front = 9999; back = 10000 이 된다.
	 * 
	 * 하지만, 원소가 한 개만 있을 경우 해당 원소는 front 이자 back 원소가 된다.
	 * 이러한 경우를 방지하기 위해
	 * deque[front] 에 원소를 넣은 뒤, front--; 을 해준다.
	 * 
	 * 결과적으로 front 요소 자체는 deque[front + 1] 위치에 자리한다.*/
	
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
