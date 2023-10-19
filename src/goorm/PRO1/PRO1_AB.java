package goorm.PRO1;

public class PRO1_AB {
	public static void main(String[] args){
		System.out.println(solution(1.123123, 0.123123));
		System.out.println(solution(-1.000000,2.000001));
	}
	public static String solution(double a, double b) {
		return String.format("%.6f", a+b);
	}
}
