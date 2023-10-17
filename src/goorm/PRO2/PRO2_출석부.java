package goorm.PRO2;

import java.util.Arrays;

public class PRO2_출석부 {
	static String[] answer;
	public static void main(String[] args) {
		System.out.println(solution("aaa"));
		System.out.println(solution("abcda"));
		System.out.println(solution("fjwhrwehrjwhjewhrr"));
		System.out.println(solution("gfedcba"));
	}
	public static String solution(String s) {
		answer = new String[s.length()];
		Arrays.fill(answer, "");
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<s.length();j++) {
				if(j==i) continue;
				answer[i] += s.charAt(j)+"";
			}
		}
		Arrays.sort(answer);
		return answer[0];
	}
}
