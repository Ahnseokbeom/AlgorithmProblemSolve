package AlgoCollection_5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;

		for(int i = 0;i<n;i++) {
			int k = 1;
			int max = 0;
			HashMap<Character, Integer> map = new HashMap<>();
			String s = br.readLine();
			if(s.length()==1) {
				sum++;
			}else {
			map.put(s.charAt(0), k);
			for(int j = 1;j<s.length();j++) {
				if(s.charAt(j)!=s.charAt(j-1)) {
					if(map.containsKey(s.charAt(j))) {
						map.put(s.charAt(j), ++k);
					}else {
						map.put(s.charAt(j), 1);
					}
				}
				max = Math.max(max, map.get(s.charAt(j)));
			}

			if(max==1) {
				sum++;
				}
			}

		}
		System.out.println(sum);

	}

}
