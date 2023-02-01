package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[100];
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1;i<=100;i++) {
			list[i-1] = (int)Math.pow(i, 2);
			if(list[i-1]>=m && list[i-1]<=n)arr.add(list[i-1]);
			if(list[i-1]>n) break;
		}
		if(arr.size()==0) System.out.println(-1);
		else{
			int sum = 0;
			for(int i = 0;i<arr.size();i++) {
				sum+=arr.get(i);
			}
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
		sc.close();
	}

}
