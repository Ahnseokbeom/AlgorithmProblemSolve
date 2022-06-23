package programmers;

public class PRO_2_SkillTest1_1 {
	class Solution {
	    public String solution(int n) {
	    	String[] list = {"4","1","2"};
	    	String answer = "";
	    	while(n>0) {
	    		answer = list[n%3]+answer;
	    		n = n%3 == 0 ? (n-1)/3 : n/3;
	    	}

	        return answer;
	    }
	}

}
