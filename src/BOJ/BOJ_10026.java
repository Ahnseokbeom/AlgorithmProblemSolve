package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10026 {
	static int RGB = 0;
	static int RB = 0;
	static int n = 0;
	static char[][] map1;
	static char[][] map2;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   n = Integer.parseInt(br.readLine());
	   map1 = new char[n][n]; // RGB
	   map2 = new char[n][n]; // RB

	   for(int i = 0;i<n;i++) {
		   String s = br.readLine();
		   for(int j = 0;j<s.length();j++) {
			   map1[i][j] = s.charAt(j);
			   if(s.charAt(j)=='G') map2[i][j] = 'R';
			   else map2[i][j] = s.charAt(j);
		   }
	   }
	   for(int i = 0;i<n;i++) {
		   for(int j = 0;j<n;j++) {
			   if(map1[i][j]!='V') {
				   RGB++;
				   dfs_rgb(i,j,map1[i][j]);
			   }
		   }
	   }
	   for(int i = 0;i<n;i++) {
		   for(int j = 0;j<n;j++) {
			   if(map2[i][j]!='V') {
				   RB++;
				   dfs_rb(i,j,map2[i][j]);
			   }
		   }
	   }
	   System.out.println(RGB+" "+RB);

   }
   public static void dfs_rgb(int x, int y, char c) {
	   if(x<0 || x>=n || y<0 || y>=n || map1[x][y] == 'C') return;
	   if((c=='R' && map1[x][y]=='R') || (c=='G' && map1[x][y]=='G') || (c=='B' && map1[x][y]=='B')) {
		   map1[x][y] = 'V';
		   for(int i = 0;i<4;i++) {
			   dfs_rgb(x+dx[i],y+dy[i],c);
		   }
	   }
   }
   public static void dfs_rb(int x, int y, char c) {
	   if(x<0 || x>=n || y<0 || y>=n || map2[x][y] == 'C') return;
	   if((c=='R' && map2[x][y]=='R') || (c=='B' && map2[x][y]=='B')) {
		   map2[x][y] = 'V';
		   for(int i = 0;i<4;i++) {
			   dfs_rb(x+dx[i],y+dy[i],c);
		   }
	   }
   }
}

