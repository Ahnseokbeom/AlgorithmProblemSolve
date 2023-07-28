package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO_4721 {
	static char[][] arr = new char[11][11];
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0;i<10;i++) {
			arr[i] = br.readLine().toCharArray();
		}
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		paint(y,x);
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<10;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void paint(int x, int y) {
		if(x == -1 || y == -1 || x == 10 || y == 10) return;
		if(arr[x][y]=='*') return;
		if(arr[x][y]=='_') arr[x][y] = '*';
		for(int i = 0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			paint(nx,ny);
		}
	}
}
