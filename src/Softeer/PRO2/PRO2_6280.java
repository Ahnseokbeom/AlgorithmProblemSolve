package Softeer.PRO2;

public class PRO2_6280 {
	public static void main(String[] args) {
		System.out.println(solution(2));
		System.out.println(solution(3));
	}
	public static int solution(int n) {
		int answer = 2;
		for(int i = 0;i<n;i++) {
			answer *= 2;
			answer -= 1;
		}
		return (int)Math.pow(answer, 2);
	}
}
