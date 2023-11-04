package CodingTest;

public class PRO1_2023_11_04 {
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		int[] arr = {5,1,4,3,2};
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				solution(arr[i]+arr[j]);
			}
		}
		System.out.println(max);
	}
	public static void solution(int n) {
		int count = 0;
		String s = Integer.toBinaryString(n);
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='1') count++;
			max = Math.max(count, max);
		}
	}
}
