package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_14003 {
	static ArrayList<Integer> list = new ArrayList<>();
	static int[] arr;
	static int[] dp;
	static int n;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		list.add(Integer.MIN_VALUE);
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(len());
		System.out.println(list);

		check(list.size()-1);
	}
	public static int len() {
		for(int i = 0;i<n;i++) {
			if(list.get(list.size()-1) < arr[i]) {
				list.add(arr[i]);
				dp[i] = list.size()-1;
			}else {
				int left = 1;
				int right = list.size()-1;

				while(left < right) {
					int mid = (left+right)/2;
					if(list.get(mid) < arr[i]) {
						left = mid+1;
					}else {
						right = mid;
					}
				}
				list.set(right, arr[i]);
				dp[i] = right;
			}
		}
		return list.size()-1;
	}
	public static void check(int size) {
		for(int i = n-1;i>=0;i--) {
			if(dp[i]==size) {
				size--;
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
	}

}
