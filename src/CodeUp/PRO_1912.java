package CodeUp;

public class PRO_1912 {
	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	public static int solution(int n) {
		if(n <= 1) return n;
		return solution(n-1)*n;
	}
}
