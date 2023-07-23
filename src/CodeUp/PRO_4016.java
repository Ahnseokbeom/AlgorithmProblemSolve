package CodeUp;

public class PRO_4016 {
	public static void main(String[] args) {
		System.out.println(gcd(4,gcd(8,10)));
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int c = a%b;
			a = b;
			b = c;
		}
		return a;
	}
}
