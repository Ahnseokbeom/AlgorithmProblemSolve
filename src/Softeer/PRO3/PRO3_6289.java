package Softeer.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class PRO3_6289 {
	static int n,m;
	static int[] arr;
	static boolean[] check;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1;i<=n;i++) arr[i] = Integer.parseInt(st.nextToken());
		List<Stack<Integer>> list = new ArrayList<>();
		for(int i = 0;i<=n;i++) list.add(new Stack<>());
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.get(x).add(y);
			list.get(y).add(x);
		}
		System.out.println(solution(list));
	}
	public static int solution(List<Stack<Integer>> list) {
		answer = 0;
		for(int i = 1;i<=n;i++) {
			while(!list.get(i).isEmpty() && arr[list.get(i).peek()] < arr[i]) {
				list.get(i).pop();
			}
			if(list.get(i).isEmpty()) answer++;
		}
		return answer;
	}
}
