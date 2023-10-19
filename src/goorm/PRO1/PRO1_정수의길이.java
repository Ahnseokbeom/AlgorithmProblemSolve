package goorm.PRO1;

public class PRO1_정수의길이 {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(-12));
		System.out.println(solution(0));
	}
	public static int solution(long n) {
		return String.valueOf(n).length();
	}
}
