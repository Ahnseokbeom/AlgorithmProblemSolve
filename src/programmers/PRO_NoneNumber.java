package programmers;

public class PRO_NoneNumber {
	class Solution {
	    public int solution(int[] numbers) {
	    	int sum = 0; // 합계 계산(numbers)
	    	for(int n : numbers) { // 합 계산
	    		sum+=n;
	    	}
	    	return 45-sum; // 0~9까지의 합이 45이므로 45-sum
	    }
	}

}
