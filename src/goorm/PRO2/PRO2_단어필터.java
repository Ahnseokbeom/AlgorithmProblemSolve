package goorm.PRO2;

public class PRO2_단어필터 {
	public static void main(String[] args){
		System.out.println(solution(5,10,"GOORM","BwDcVGOORM"));
		System.out.println(solution(5, 12, "goorm","goormabgoorm"));
		System.out.println(solution(1, 5, "A", "AAAAA"));
		System.out.println(solution(1, 0, "A", ""));
	}
	public static String solution(int sLen, int eLen,String s, String e) {
        int index = e.indexOf(s);
        while (index != -1) {
            e = e.substring(0, index) + e.substring(index + s.length());
            index = e.indexOf(s);
        }

        if (e.isEmpty()) {
            return "EMPTY";
        } else {
            return e;
        }
    }
}
