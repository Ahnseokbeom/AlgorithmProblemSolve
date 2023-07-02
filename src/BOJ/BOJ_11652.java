package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;

public class BOJ_11652 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1;i<=n;i++) {
			int num = Integer.parseInt(br.readLine());
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map.keySet().stream().max(Comparator.comparing(map::get)).orElse(null));
	}
}
