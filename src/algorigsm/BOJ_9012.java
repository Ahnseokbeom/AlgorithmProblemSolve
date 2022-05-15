package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트케이스 갯수
		for(int i = 0;i<t;i++) {
			sb.append(answer(br.readLine())+"\n"); // sb에 NO / YES 값 저장
		}
		System.out.println(sb);
		
	}
	public static String answer(String s) { // 괄호를 판단하는 함수
		Stack<Character> stack = new Stack<Character>(); 
		for(int i = 0;i<s.length();i++) { // s의 크기만큼 반복
			char c = s.charAt(i); // 문자열의 각 문자열 비교
			if(c == '(') { // '('와 같으면
				stack.push(c); // 스택에 저장
			}else if(stack.empty()) { // 스택이 비어있으면
				return "NO"; // NO 리턴
			}else {
				stack.pop(); // 둘 다 아니면 삭제
			}
		}
		if(stack.empty()) { // 위의 작업을 마치고 스택이 비어있으면 YES 리턴
			return "YES";
		}else
			return "NO"; // 아니면 NO 리턴
	}
}
