package goorm.PRO2;

public class PRO2_49072 {
	public static void main(String[] args) {
		System.out.println(solution("213412")?"Yes":"No");
		System.out.println(solution("212")?"Yes":"No");
		System.out.println(solution("1728271")?"Yes":"No");
//		String s = "213412";
//		System.out.println(s);
//		s = s.replaceAll("[3-9]", "");
//		System.out.println(s);
	}
	public static boolean solution(String s) {
		if(s.length()< 4) return false;
		return s.contains("21") && s.contains("12");
	}
}
