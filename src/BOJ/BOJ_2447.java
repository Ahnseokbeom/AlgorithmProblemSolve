package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2447 {
	static String[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new String[n][n];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) arr[i][j] = " ";
		}
		star(arr,0,0,n);
		rec();
	}
	public static void star(String[][] arr, int x, int y, int n) {
		if(n==1) {
			arr[x][y] = "*";
			return;
		}
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(!(i==1 && j== 1)) star(arr,x+i*(n/3),y+j*(n/3),n/3);
			}
		}
	}
	public static void rec() {
		for(String[] str : arr) {
			for(String s : str) System.out.print(s+"");
			System.out.println(" ");
		}
	}

}
