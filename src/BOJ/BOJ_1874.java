package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		int start = 0;
		
		while(n-- > 0) { // n��ŭ �ݺ�
			int num = Integer.parseInt(br.readLine()); // �� �Է� �ޱ�
			if(num > start) { // start+1���� �Է¹��� num������ push �Ѵ�.
				for(int i = start+1;i<=num;i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = num; // ���� push�� �� �������� �����ϱ� ���ؼ� ���� �ʱ�ȭ
			}else if(stack.peek()!=num) { // top�� �ִ� ���� num�� ���ٸ�
				System.out.println("NO");
				System.exit(0);
			}
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}

}
