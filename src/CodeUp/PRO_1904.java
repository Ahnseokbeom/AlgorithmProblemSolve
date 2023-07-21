package CodeUp;

public class PRO_1904 {
	public static void main(String[] args) {
		solution(2, 7);
	}
	public static void solution(int a, int b) {
		if(a%2!=0) System.out.println(a);
		if(a >= b) return;
		solution(++a,b);
	}

}
