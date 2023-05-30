package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class BOJ_7785 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<>();

		for(int i = 0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			String name = s[0];
			String state = s[1];
			if(state.equals("leave")) {
				map.remove(name);
			}else map.put(name, state);
		}
		Set<String> set = map.keySet();
		ArrayList<String> answer = new ArrayList<>(set);
		Collections.sort(answer,Collections.reverseOrder());
		for(String i : answer) System.out.println(i);
	}

}
