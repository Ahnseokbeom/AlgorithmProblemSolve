package BOJ;

import java.util.Arrays;

public class FullSearch {
	static void solution(String[] a , int index) {
		if(index>=a.length) {
			System.out.println(Arrays.toString(a));
			return;
		}
		a[index] = "0";
		solution(a,index+1);
		a[index] = "1";
		solution(a,index+1);
		a[index] = "2";
		solution(a,index+1);
	}
	public static void main(String[] args) {
		solution(new String[3],0);
	}

}
