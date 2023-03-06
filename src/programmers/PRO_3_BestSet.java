package programmers;

import java.util.HashSet;

public class PRO_3_BestSet {
	public static void main(String[] args) {
		// 1 4 4 / 1 2 6 / 1 3 5 / 2 3 4
		int n = 2;
		int s = 9;
		int[] answer = {};
		HashSet<int[]> set = new HashSet<>();
		for(int i = 1;i<s/n;i++) {
			int j = i+1;
			while(true) {
				if(j==s-s/n) break;
				set.add(new int[] {i,j});
			}
		}
		System.out.println(s/2);
	}
}
