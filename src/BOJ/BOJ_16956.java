package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16956 {
	static int r,c;
	static char[][] arr;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new char[r][c];
		boolean check = true;
		for(int i = 0;i<r;i++) {
			String s = br.readLine();
			for(int j = 0;j<c;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(arr[i][j] == 'W') {
                    for(int xy = 0 ; xy<4; xy++) {
                        int nx = i+dx[xy];
                        int ny = j+dy[xy];
                        if(nx >=0 && nx< r && ny >=0 && ny<c) {
                            if(arr[nx][ny]=='.') {
                                arr[nx][ny]='D';
                            }else if(arr[nx][ny]=='S') {
                                check = false;
                                System.out.println(0);
                                return;
                            }
                        }
                    }
                }
            }
        }

        if(!check) {
            System.out.println(0);
        }else {
            StringBuilder sb = new StringBuilder();
            System.out.println(1);
            for(int i=0;i<r;i++) {
                sb.append(arr[i]);
                sb.append("\n");
            }
            System.out.println(sb);
        }
	}

}
