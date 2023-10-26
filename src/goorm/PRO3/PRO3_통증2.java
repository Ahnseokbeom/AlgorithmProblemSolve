package goorm.PRO3;

public class PRO3_통증2 {
	public static void main(String[] args) {
		System.out.println(solution(11, 2, 7));
		System.out.println(solution(10000, 4, 13));
		System.out.println(solution(10, 3, 5));
	}
	public static int solution(int n, int a, int b) {
        int answer = Integer.MAX_VALUE;

        for (int Ap = 0; Ap <= n / a; Ap++) {
            int remainingPain = n - Ap * a;

            if (remainingPain % b == 0) {
                int Bp = remainingPain / b;
                int sum = Ap + Bp;
                answer = Math.min(answer, sum);
            }
        }
        return answer == Integer.MAX_VALUE?-1:answer;
    }
}
