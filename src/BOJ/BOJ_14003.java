package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_14003 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(Integer.MIN_VALUE);
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

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
		System.out.println(list.size()-1);

		int size = list.size()-1;
		Stack<Integer> stack = new Stack<>();
		for(int i = n-1;i>=0;i--) {
			if(dp[i]==size) {
				size--;
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
	}

}
