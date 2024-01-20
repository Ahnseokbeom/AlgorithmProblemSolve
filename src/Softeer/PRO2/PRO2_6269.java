package Softeer.PRO2;

public class PRO2_6269 {
	public static void main(String[] args) {
		System.out.println(solution(3, 10, 5, new int[] {1,4,5}, new int[] {3,3,1,2,4,1,4,5,1,4}));
		System.out.println(solution(4, 10, 3, new int[] {2,1,3,2}, new int[] {1,3,2,1,3,2,1,3,2,1}));
		System.out.println(solution(4, 10, 9, new int[] {2,7,1,8}, new int[] {3,1,4,1,5,9,2,6,5,3}));
		System.out.println(solution(4, 3, 5, new int[] {1,2,3,4}, new int[] {3,2,1}));
	}
	public static String solution(int m, int n, int k,int[] arr1, int[] arr2) {
		if(n < m) return "normal";
		String s = "";
		for(int i = 0;i<m;i++) s += String.valueOf(arr1[i]);
		String str = "";
		for(int i = 0;i<n;i++) str += String.valueOf(arr2[i]);
		return str.contains(s)?"secret":"normal";
	}
}
