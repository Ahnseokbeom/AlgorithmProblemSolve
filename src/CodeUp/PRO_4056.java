package CodeUp;

public class PRO_4056 {
	public static void main(String[] args) {
		System.out.println(solution(3130));
	}
	public static int solution(int n) {
		int sum = 0;
		if(n < 1) return 0;
		if(n <= 500) sum = (int)(n * 0.7);
		else if(n > 500 && n <= 1500) sum = 350+(int)((n-500)*0.4);
		else if(n > 1500 && n <= 4500) sum = 750+(int)((n-1500)*0.15);
		else if(n > 4500 && n <=10000) sum = 1200+(int)((n-4500)*0.05);
		else sum = 1475+(int)((n-10000)*0.02);
		return sum;
	}
}
