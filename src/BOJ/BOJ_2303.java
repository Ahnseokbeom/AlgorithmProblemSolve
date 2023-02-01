package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int[] list = new int[5];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<5;j++) {
				list[j] = sc.nextInt();
			}
			int max = Integer.MIN_VALUE;
			for(int a = 0;a<3;a++) {
				for(int b = a+1;b<4;b++) {
					for(int c = b+1;c<5;c++) {
						max = Math.max(max, (list[a]+list[b]+list[c])%10);
					}
				}
			}
			arr.add(max);
		}
		Integer result = arr.stream().mapToInt(x->x).max().getAsInt();
		System.out.println(arr.lastIndexOf(result)+1);
		sc.close();
	}

}
