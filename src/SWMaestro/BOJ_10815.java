package SWMaestro;

import java.util.Arrays;

public class BOJ_10815 {
	public static int[] solution(int n, int[] Narr,int m, int[] Marr) {
		int[] answer = new int[Marr.length];
		Arrays.sort(Narr);
		for(int i = 0;i<Marr.length;i++) {
			if(check(Marr[i],Narr)>=0) answer[i] = 1;
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 5;
		int[] Narr = {6,3,2,10,-10};
		int m = 8;
		int[] Marr = {10,9,-5,2,3,4,5,-10};
		System.out.println(Arrays.toString(solution(n,Narr,m,Marr)));
	}
	public static int check(int n, int[] Narr) {
		int left = 0;
		int right = Narr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(Narr[mid]>n) {
				right = mid-1;
			}else if(Narr[mid]<n) {
				left = mid+1;
			}else return mid;
		}
		return -1;
	}

}
