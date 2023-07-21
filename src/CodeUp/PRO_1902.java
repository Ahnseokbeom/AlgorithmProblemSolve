package CodeUp;

public class PRO_1902 {
	public static void main(String[] args) {
		solution(10);
	}
	public static void solution(int n) {
		System.out.println(n);
		if(n <= 1) return;
		solution(--n);
	}
}
