package goorm.PRO2;

import java.util.ArrayList;

public class PRO2_159545 {
	static int answer;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		System.out.println(solution1(8, new int[] {1,2,3,4,-1,-2,-3,-5}));
		System.out.println(solution1(8, new int[] {-1,1,2,-2,3,-3,4,5}));
	}
	public static int solution1(int n, int[] arr) {
		answer = 0;
		for(int i = 0;i<arr.length;i++) answer+=arr[i];
		return answer;
	}
}
