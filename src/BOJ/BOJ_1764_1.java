package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_1764_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); // 듣지 못한 사람
		int m = Integer.parseInt(st.nextToken()); // 보지 못한 사람
		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			set.add(br.readLine());
		}
		for(int i = 0;i<m;i++) {
			String s = br.readLine();
			if(set.contains(s)) list.add(s);
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i = 0;i<list.size();i++) System.out.println(list.get(i));
	}

}
