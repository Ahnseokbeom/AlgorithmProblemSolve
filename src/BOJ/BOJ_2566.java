package BOJ;

import java.util.Scanner;

public class BOJ_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		int max = Integer.MIN_VALUE;
		int x = 0;
		int y = 0;
		for(int i = 1;i<10;i++) {
			for(int j = 1;j<10;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max) {
				max = arr[i][j];
				x = i;
				y = j;
				}
			}
		}
		System.out.printf("%d\n%d %d",max,x,y);
		sc.close();
	}

}
