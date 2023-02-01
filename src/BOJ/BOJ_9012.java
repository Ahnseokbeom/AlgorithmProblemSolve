package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		for(int i = 0;i<t;i++) {
			sb.append(answer(br.readLine())+"\n"); // sb�� NO / YES �� ����
		}
		System.out.println(sb);
		
	}
	public static String answer(String s) { // ��ȣ�� �Ǵ��ϴ� �Լ�
		Stack<Character> stack = new Stack<Character>(); 
		for(int i = 0;i<s.length();i++) { // s�� ũ�⸸ŭ �ݺ�
			char c = s.charAt(i); // ���ڿ��� �� ���ڿ� ��
			if(c == '(') { // '('�� ������
				stack.push(c); // ���ÿ� ����
			}else if(stack.empty()) { // ������ ���������
				return "NO"; // NO ����
			}else {
				stack.pop(); // �� �� �ƴϸ� ����
			}
		}
		if(stack.empty()) { // ���� �۾��� ��ġ�� ������ ��������� YES ����
			return "YES";
		}else
			return "NO"; // �ƴϸ� NO ����
	}
}
