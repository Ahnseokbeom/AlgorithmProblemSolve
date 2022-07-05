package programmers;

import java.util.Arrays;

public class PRO_player {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	String answer = "";
	    	Arrays.sort(participant);
	    	Arrays.sort(completion);

	    	int i =0;
	    	for(;i<completion.length;i++) {
	    		if(!participant[i].equals(completion[i])) {
	    			return participant[i];
	    		}

	    	}
	    	answer = participant[i];
	    	return answer;
	    }
	}

}
