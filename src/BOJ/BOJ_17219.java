package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_17219 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, String> map = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			String[] str = s.split(" ");
			map.put(str[0], str[1]);
		}
		for(int i = 0;i<m;i++) {
			String pass = br.readLine();
			sb.append(map.get(pass)).append("\n");
		}
		System.out.println(sb);
	}

}
