package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_20920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			String s = br.readLine();
			if(s.length()<m) continue;
			Integer cnt = map.getOrDefault(s, 0);
			map.put(s, cnt+1);
		}
		List<String> word = map.keySet().stream().collect(Collectors.toList());
		word.sort((o1,o2)->{
			int a = map.get(o1);
			int b = map.get(o2);
			if(a==b) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}
			}
			return b-a;
		});
		for(String str : word) sb.append(str).append("\n");
		System.out.println(sb);
	}

}
