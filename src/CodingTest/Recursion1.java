package CodingTest;

public class Recursion1 {
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(fac(5));
	}
	static private int sum(int n) {
		if(n < 2) return n;
		return n + sum(n-1);
	}
	static private int fac(int n) {
		if(n < 2) return n;
		return n * fac(n-1);
	}

}
