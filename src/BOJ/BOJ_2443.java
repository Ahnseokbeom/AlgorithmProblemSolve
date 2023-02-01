package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int j = 1;
		for(int i = 0;i<n;i++) {
			arr.add(j);
			j+=2;
		}
		for(int a = n;a>=1;a--) {
			for(int b = 0;b<n-a;b++) {
				System.out.print(" ");
			}
			for(int c = arr.get(a-1);c>0;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
