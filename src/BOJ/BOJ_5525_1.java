package BOJ;

public class BOJ_5525_1 {
	public static void main(String[] args) {
		int n1 = 1;
		int m1 = 13;
		String s1 = "OOIOIOIOIIOII";
		System.out.println(solution(n1, m1, s1));

		int n2 = 2;
		int m2 = 13;
		String s2 = "OOIOIOIOIIOII";
		System.out.println(solution(n2, m2, s2));
	}
	public static int solution(int n, int m, String s) {
		int answer = 0;
		char[] c = s.toCharArray();
		int[] arr = new int[m];
		for(int i = 1;i<m-1;i++) {
			if(c[i] == 'O' && c[i+1]=='I') {
				arr[i+1] = arr[i-1]+1;
				if(arr[i+1]>= n && c[i-2*n+1] == 'I') answer++;
			}
		}
		return answer;
	}

}
