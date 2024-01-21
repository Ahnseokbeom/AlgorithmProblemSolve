package goorm.PRO2;

import java.util.HashSet;

public class PRO2_175909 {
	public static void main(String[] args) {
		System.out.println(solution(4, 10, new int[] {2,1,1,1,1,4,3,1,4,2}));
		System.out.println(solution(6, 10, new int[] {4,5,6,5,2,1,4,5,6,1}));
	}
	public static int solution(int n, int m, int[] arr) {
		int answer = -1;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0;i<m;i++) {
			set.add(arr[i]);
			if(set.size()==n) {
				answer = i+1;
				break;
			}
		}
		return answer==-1?-1:answer;
	}
}
