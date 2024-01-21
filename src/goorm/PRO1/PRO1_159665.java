package goorm.PRO1;

public class PRO1_159665 {
	public static void main(String[] args) {
		System.out.println(solution(4,"goorm"));
		System.out.println(solution(9, "algorithm"));
	}
	public static int solution(int n,String s) {
		return s.replaceAll("(.)\\1+", "$1").length();
	}
}
