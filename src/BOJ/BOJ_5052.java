package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_5052 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			String list[] = new String[n];
			for(int i = 0;i<n;i++) {
				String s = br.readLine();
				map.put(s, 1);
				list[i] = s;
			}
			Arrays.sort(list);
			if(check(n,list,map)) sb.append("YES\n");
			else sb.append("NO\n");
		}
		System.out.println(sb);
	}
	public static boolean check(int len, String[] list, HashMap<String, Integer> map) {
		for(int i = 0;i<len;i++) {
			for(int j = 1;j<list[i].length();j++) {
				if(map.containsKey(list[i].subSequence(0, j))) return false;
			}
		}
		return true;
	}

}
