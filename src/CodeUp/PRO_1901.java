package CodeUp;

public class PRO_1901 {
	static int num = 1;
	public static void main(String[] args) {
		solution(10);
	}
	public static void solution(int n) {
		System.out.println(num);
		++num;
		if(num>n) return;
		solution(n);
	}
}
