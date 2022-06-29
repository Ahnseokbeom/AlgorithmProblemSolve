package programmers;

public class PRO_Fibo {
	public static void main(String[] args) {
		System.out.println(fibo(3));
	}
	public static int fibo(int n) {
		if(n<=2) {
			return 1;
		}else {
			return fibo(n-2)+fibo(n-1);
		}
	}
}
