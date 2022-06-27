package programmers;

import java.util.Arrays;
import java.util.Collections;

public class PRO_StringSort {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] str = new String[s.length()-1];
	        for(int i = 0;i<s.length();i++){
	            str[i] = s.charAt(i)+"";
	        }
	        Arrays.sort(str);

	        return answer;
	    }
	}
	public static void main(String[] args) {
		String a = "Zbcdefg";
		String[] s = new String[a.length()];
		for(int i = 0;i<a.length();i++) {
			s[i] = a.charAt(i)+"";
		}
		Arrays.sort(s,Collections.reverseOrder());
		System.out.println(Arrays.toString(s));

	}

}
