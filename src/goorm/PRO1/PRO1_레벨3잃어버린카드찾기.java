package goorm.PRO1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRO1_레벨3잃어버린카드찾기 {
	public static void main(String[] args) {
		solution(4, new int[] {3,1,4});
		solution(7, new int[] {2,3,5,7,4,1});
	}
	public static void solution(int n, int[] arr) {
		int[] arr1 = new int[n+1];
		Arrays.fill(arr1, 0);
		Arrays.stream(arr).forEach(i -> arr1[i] = 1);
		System.out.println(Arrays.toString(arr1));
		int answer = IntStream.rangeClosed(1, n)
                .filter(i -> arr1[i] == 0)
                .findFirst()
                .orElse(-1);
		System.out.println(answer);
	}
}
