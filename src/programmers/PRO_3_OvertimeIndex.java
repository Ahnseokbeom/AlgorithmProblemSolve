package programmers;

import java.util.Arrays;
import java.util.Collections;

public class PRO_3_OvertimeIndex {
	public static void main(String[] args) {
		int n = 4;
		int[] works = {4,3,3};
		long sum = 0;
		Integer[] result = new Integer[works.length];
		for(int i = 0;i<works.length;i++) {
			result[i] = works[i];
			sum+=works[i];
		}
		if(sum<=n) System.out.println(0);
		while(n-->0) {
			Arrays.sort(result,Collections.reverseOrder());
			result[0]--;
		}
		int answer = 0;
		for(int i = 0;i<result.length;i++) {
			answer+=Math.pow(result[i], 2);
		}
		System.out.println(answer);
	}

}
