package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 전체 카드의 개수
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<n;i++) {
			int key = Integer.parseInt(st.nextToken());
			// key에 대한 저장된 값을 반환하고 없으면 0을 반환
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		int m = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드의 개수
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<m;i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(key, 0)).append(" ");
		}
		System.out.println(sb);
	}
}
