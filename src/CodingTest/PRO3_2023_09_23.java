package CodingTest;

import java.util.Arrays;

public class PRO3_2023_09_23 {
	static boolean[] check;
	static int n1 = 4, n2 = 5;
	static int[][] list = new int[n1+1][n1+1];
	static int count;
	static int[] arr;
	public static void main(String[] args) {

		check = new boolean[n1+1];
		arr = new int[n1+1];
		int answer = 0;
		int[][] arr1 = {{1,2},{2,3},{3,1}};
		int[][] arr2 = {{1,2},{2,3}};
		for(int i = 0;i<arr1.length;i++) {
			int x = arr1[i][0];
			int y = arr1[i][1];
			list[x][y] = 1;
			list[y][x] = 1;
		}
		int i = 0;
		while(i<arr1.length) {
			count = 1;
			dfs(arr1[i][0]);
			System.out.println("count : "+count+" i : "+i);
			i+=count+1;
			n1-=count;
			answer+=count*n1;
		}
		System.out.println(n1);
		for(int j = 1;j<n1;j++) answer+=j;
		System.out.println(Arrays.toString(check));
		System.out.println(Arrays.toString(arr));
		System.out.println("answer : "+answer);
	}
	public static int dfs(int x) {
		check[x] = true;
		arr[x] = 1;
		for(int i = x;i<=n1;i++) {
			if(list[x][i]==1 && !check[i]) {
				count++;
				dfs(i);
			}
		}
		return count;
	}
}
