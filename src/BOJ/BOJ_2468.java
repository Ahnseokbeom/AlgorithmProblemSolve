package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2468 {
	static int [][] arr;
	static boolean [][] check;
	static ArrayList<Integer> list;
	static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[n][n];
		check = new boolean[n][n];
		int max_inarr=0;
		for(int i = 0 ; i < n ; i ++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max_inarr < arr[i][j])
					max_inarr = arr[i][j];
			}
		}
		list = new ArrayList<>();

        for(int d = 0 ; d<= max_inarr ; d++) {
        	int cnt = 0;
	        for(int i = 0 ; i < n ; i ++) {
	        	for(int j = 0 ; j < n ; j++) {
	        		if(arr[i][j] > d && !check[i][j]) {
	        			cnt++;
	        			dfs(i,j, d);

	        		}
	        	}
	        }
	        for(boolean a[]: check) Arrays.fill(a, false);
	        list.add(cnt);
        }

		System.out.println(Collections.max(list));
	}

	public static void dfs(int x, int y, int d) {
		check[x][y] = true;

		for(int i = 0 ; i < 4 ; i ++) {
    		int nx = x + dx[i];
    		int ny = y + dy[i];

    		if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr.length) {
    			if(arr[nx][ny] > d && !check[nx][ny])
    				dfs(nx,ny, d);
    		}
    	}
	}
}
