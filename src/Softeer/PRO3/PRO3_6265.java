package Softeer.PRO3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO3_6265 {
	static int[] di = {0,0,1,-1};
    static int[] dj = {-1,1,0,0};
    static int[][] arr;
    static boolean[][] check;
    static int h,w;
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      h = Integer.parseInt(st.nextToken());
      w = Integer.parseInt(st.nextToken());
      arr = new int[h+1][w+1];
      check = new boolean[h+1][w+1];
      for(int i = 1;i<=h;i++){
        st = new StringTokenizer(br.readLine());
        for(int j = 1;j<=w;j++){
          arr[i][j] = Integer.parseInt(st.nextToken());
        }
      }
      int q = Integer.parseInt(br.readLine());
      while(q-->0){
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(arr[i][j]!=c){
          int n = arr[i][j];
          dfs(i,j,c,n);
        }
      }
      StringBuilder sb = new StringBuilder();
       for(int a = 1;a<=h;a++){
            for(int b = 1;b<=w;b++){
              if(b==w) sb.append(arr[a][b]);
              else sb.append(arr[a][b]+" ");
            }
          if(a==h) continue;
          else sb.append("\n");
	        }
	        System.out.println(sb);
	   }
    public static void dfs(int i, int j, int c, int n) {
        check[i][j] = true;
        arr[i][j] = c;
        for (int a = 0; a < 4; a++) {
            int ni = i + di[a];
            int nj = j + dj[a];
            if (ni >= 1 && ni <= h && nj >= 1 && nj <= w) {
                if (!check[ni][nj] && arr[ni][nj] == n) {
                    dfs(ni, nj, c, n);
                }
            }
        }
        check[i][j] = false;
    }
}
