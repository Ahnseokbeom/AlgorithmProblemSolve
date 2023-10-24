package goorm.PRO4;

public class PRO4_새로운암호화 {
	public static void main(String[] args) {
		System.out.println(solution(2L, 4L));
		System.out.println(solution(111L, 222L));
		System.out.println(solution(12345L, 12345L));
		System.out.println(solution(500L, 9999L));
	}
	 public static long xor(long n) {
		 if(n % 4 == 0) return n;
		 else if(n % 4 == 1) return 1;
		 else if(n % 4 == 2) return n+1;
		 else return 0;
    }
	public static long solution(long A, long B) {
		long answer = xor(B)^xor(A-1);
		return answer;
	}
}
