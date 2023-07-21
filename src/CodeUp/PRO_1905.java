package CodeUp;

public class PRO_1905 {
	static int num = 1;
	static int sum = 0;
	public static void main(String[] args) {
		solution(100);
		System.out.println(sum);
	}
	public static void solution(int n) {
		sum+=num;
		num++;
		if(num >n) return;
		solution(n);
	}

}
