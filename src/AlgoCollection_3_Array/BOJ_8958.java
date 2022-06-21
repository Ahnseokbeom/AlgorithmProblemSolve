package AlgoCollection_3_Array;

import java.util.Scanner;

public class BOJ_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[sc.nextInt()];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		for(int i = 0;i<arr.length;i++) {
			int cnt = 0; // 누적 합
			int sum = 0; // 총합
			for(int j  = 0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {
					cnt+=1;
				}else {
					cnt = 0;
				}
				sum+=cnt;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
