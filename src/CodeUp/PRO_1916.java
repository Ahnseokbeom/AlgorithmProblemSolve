package CodeUp;

public class PRO_1916 {
	static int mod = 10009;
	public static void main(String[] args) {
		System.out.println(solution(7)%mod);
	}
	public static long solution(int n) {
		if(n <= 2) return 1;
		return (solution(n-1)%mod+solution(n-2)%mod);
	}
}
