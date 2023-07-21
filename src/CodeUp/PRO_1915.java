package CodeUp;

public class PRO_1915 {
	public static void main(String[] args) {
		System.out.println(solution(7));
	}
	public static int solution(int n) {
		if(n <= 2) return 1;
		return solution(n-1)+solution(n-2);
	}

}
