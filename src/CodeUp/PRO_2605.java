package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO_2605 {
	static int[][] arr;
	static int[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[7][7];
		check = new int[7][7];
		int answer = 0;
		for(int i = 0;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(dfs(i,j) >= 3) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	public static int dfs(int x, int y) {
		check[x][y] = 1;
		int count = 1;
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			 if (nx < 0 || nx > 6 || ny < 0 || ny > 6)continue;
			 else
               if(check[nx][ny] == 0 && arr[x][y] == arr[nx][ny]) {
                    count += dfs(nx, ny);
            }
		}
		return count;
	}
}
