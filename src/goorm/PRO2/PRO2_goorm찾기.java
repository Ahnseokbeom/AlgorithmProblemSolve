package goorm.PRO2;

public class PRO2_goorm찾기 {
	public static void main(String[] args) {
		String target = "goorm";
		System.out.println(solution("goormgoorm", target));
		System.out.println(solution("qgugoormgo", target));
		System.out.println(solution("hellolevel", target));
	}
	public static int solution(String s, String target) {
		int count = 0;
		int idx = s.indexOf(target);
		while(idx != -1) {
			count++;
			idx = s.indexOf(target,idx+1);
		}
		return count;
	}
}
