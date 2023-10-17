package goorm.PRO1;

public class PRO1_숫자제거배열 {
	public static void main(String[] args) {
		System.out.println(solution(5, 2, new int[] {10,20,22,12,11}));
		System.out.println(solution(5, 12, new int[] {12,122,21,19,30}));
	}
	public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		for(int i = 0;i<arr.length;i++) {
			if(!String.valueOf(arr[i]).contains(String.valueOf(k))) answer++;
		}
		return answer;
	}
}
