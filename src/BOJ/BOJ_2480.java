package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		if(x==y && y==z && x==z) {
			sb.append(10000+(x*1000));
		}else if(x!=y && y!=z && x!=z) {
			sb.append((Math.max(Math.max(x, y), z))*100);
		}else if(x==y) {
			sb.append(1000+(x*100));
		}else if(y==z) {
			sb.append(1000+(y*100));
		}else if(x==z) {
			sb.append(1000+(z*100));
		}
		System.out.println(sb);
	}

}
