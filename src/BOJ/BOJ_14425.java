package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int count = 0;
		HashMap<Integer, String> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			map.put(i, br.readLine());
		}
		for(int i = 0;i<m;i++) {
			String s = br.readLine();
			if(map.containsValue(s)) count++;
		}
		System.out.println(count);
	}

}
