package goorm.PRO1;

public class PRO1_174732 {
	public static void main(String[] args) {
		System.out.println(solution("goormLevel"));
		System.out.println(solution("commit"));
		System.out.println(solution("cC"));
	}
	public static String solution(String s){
		String answer = "";
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				answer+=(char)(s.charAt(i)-32)+"";
			}else answer+=(char)(s.charAt(i)+32)+"";
		}
		return answer;
	}
}
