package programmers;

public class PRO_NoneNumber {
	class Solution {
	    public int solution(int[] numbers) {
	    	int sum = 0; // �հ� ���(numbers)
	    	for(int n : numbers) { // �� ���
	    		sum+=n;
	    	}
	    	return 45-sum; // 0~9������ ���� 45�̹Ƿ� 45-sum
	    }
	}

}
