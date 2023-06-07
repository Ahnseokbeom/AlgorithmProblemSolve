package BOJ;

public class BOJ_13305 {
	public static void main(String[] args) {
		System.out.println(solution(4, new long[] {2,3,1}, new long[] {5,2,4,1}));
		System.out.println(solution(4, new long[] {3,3,4}, new long[] {1,1,1,1}));
	}
	public static long solution(int n, long[] km, long[] price) {
		long sum = 0;
		long min = price[0];
		for(int i = 0;i<km.length;i++) {
			if(price[i] < min) min = price[i];
			sum+=(min*km[i]);
		}
		return sum;
	}

}
