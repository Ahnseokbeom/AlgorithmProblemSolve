package CodeUp;

public class PRO_1953 {
	static String s = "*";
	static String plus = "*";
	public static void main(String[] args) {
		solution(1,3);
	}
	public static void solution(int num, int n) {
		if(num > n) return;
		num++;
		System.out.println(s);
		s += plus;
		solution(num,n);
	}
}
