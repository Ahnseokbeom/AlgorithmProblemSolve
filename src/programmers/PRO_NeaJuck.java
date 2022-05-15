package programmers;

//³»Àû
public class PRO_NeaJuck {
	class Solution {
	    public int solution(int[] a, int[] b) {
	    	int result = 0;
	    	for(int i = 0;i<a.length;i++) {
	    		result +=a[i]*b[i];
	    	}
	        int answer = result;
	        return answer;
	    }
	}

}
