package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO_2_JadenCase {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] str = s.split(" ");
	        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str));
	        for(int i = 0;i<arr.size();i++) {
				char c = arr.get(i).length()==0?'#':arr.get(i).charAt(0);
				if(c=='#') {
					answer+=' ';
					continue;
				}else {
					if(c>='a' || c<='z' || c>='A' || c<='Z') {
						answer+= arr.get(i).substring(0,1).toUpperCase();
					}else {
						answer+=c;
					}
					answer+=arr.get(i).substring(1,arr.get(i).length()).toLowerCase();
					if(i==arr.size()-1) {
						break;
					}else {
						answer+=" ";
					}
				}
			}
	        if(answer.length()!=s.length()) {
				for(int i = 0;i<s.length()-answer.length();i++) {
					answer+=' ';
				}
			}
	        return answer;
	    }
	}

}
