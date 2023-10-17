package goorm.PRO2;

public class PRO2_단어필터 {
	public static void main(String[] args){
		System.out.println(solution(5,10,"GOORM","BwDcVGOORM"));
		System.out.println(solution(5, 12, "goorm","goormabgoorm"));
		System.out.println(solution(1, 5, "A", "AAAAA"));
	}
	public static String solution(int s, int e, String s1, String s2) {
		return s2.replaceAll(s1, "").equals("")?"EMPTY":s2.replaceAll(s1, "");
	}
}
