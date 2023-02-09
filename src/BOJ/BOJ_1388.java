package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1388 {
	static int n, m;
	static char[][] ch;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		ch = new char[n][m];
		visit = new boolean[n][m];

		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			for(int j = 0;j<m;j++) {
				ch[i][j] = s.charAt(j);
			}
		}

		int count = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(!visit[i][j]) continue;
				if(ch[i][j]=='-') dfs(i,j,true);
				else dfs(i,j,false);
				count++;
			}
		}
		System.out.println(count);
	}
	private static void dfs(int x, int y, boolean row) {
		visit[x][y] = true;
		if(row) {
			y++;
			if(y<m && ch[x][y] == '-') dfs(x,y,true);
			else {
				x++;
				if(x<n && ch[x][y]!='-') dfs(x,y,false);
			}
		}
	}

}
