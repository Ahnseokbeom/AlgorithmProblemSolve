package algorigsm;

import java.util.Scanner;

public class BOJ_2798 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드의 개수
		int m = sc.nextInt(); // 블랙잭 번호
		int[] arr = new int[n];
		int max = 0;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				for(int k = j+1;k<n;k++) {
					sum = arr[i]+arr[j]+arr[k];
					if(sum>max && sum <=m) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
		
	}

}
