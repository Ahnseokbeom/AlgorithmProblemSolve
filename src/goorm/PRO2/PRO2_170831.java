package goorm.PRO2;

import java.util.Arrays;
import java.util.HashMap;

public class PRO2_170831 {
	static StringBuilder sb;
	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {10,3,7,4,1}));
		System.out.println(solution(7, new int[] {7,2,6,4,9,8,1}));
	}
	public static StringBuilder solution(int n, int[] arr) {
		sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) map.put(arr[i], i+1);
		Arrays.sort(arr);
		for(int i = n-1;i>=n-3;i--) sb.append(map.get(arr[i])+" ");
		return sb;
	}
}
