package CodingTest;

import java.util.Arrays;

public class PRO3 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,1,3,2}));
		System.out.println(solution(new int[] {4,1,3}));
	}
	public static boolean solution(int[] arr) {
		boolean answer = true;
		Arrays.sort(arr);
		for(int i = 1;i<=arr.length;i++) {
			if(arr[i-1]!=i) return false;
		}
		return answer;
	}

}