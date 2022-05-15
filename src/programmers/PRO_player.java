package programmers;

import java.util.*;

public class PRO_player {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	String answer = "";
	    	Arrays.sort(participant); // 오름차순 정렬
	    	Arrays.sort(completion); // 오름차순 정렬
	    	
	    	int i =0;
	    	for(;i<completion.length;i++) { // 성공자가 다 나올때까지
	    		if(!participant[i].equals(completion[i])) { // 실패한 사람이라면 
	    			return participant[i]; // 실패한 사람 리턴
	    		}
	    			
	    	}
	    	answer = participant[i]; // 실패한 사람 답에 저장
	    	return answer;
	    }
	}

}
