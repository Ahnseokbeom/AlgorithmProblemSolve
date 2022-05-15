package algorigsm;

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
		
		while(n-- > 0) { // n만큼 반복
			int num = Integer.parseInt(br.readLine()); // 값 입력 받기
			if(num > start) { // start+1부터 입력받은 num까지를 push 한다.
				for(int i = start+1;i<=num;i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = num; // 다음 push할 때 오름차순 유지하기 위해서 변수 초기화
			}else if(stack.peek()!=num) { // top에 있는 값이 num과 같다면
				System.out.println("NO");
				System.exit(0);
			}
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}

}
