package CodeUp;

public class PRO_1928 {
	public static void main(String[] args) {
		solution(5);
	}
	public static void solution(int n) {
		System.out.println(n);
		if(n <= 1) return;
		if(n%2==0) solution(n/2);
		if(n%2!=0) solution(n*3+1);
	}

}
