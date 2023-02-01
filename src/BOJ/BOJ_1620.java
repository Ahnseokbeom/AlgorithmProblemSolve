package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = new String[N+1];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<N;i++) {
			String name = br.readLine();
			map.put(name, i);
			arr[i] = name;
		}
		
		while(M-- > 0) {
			String s = br.readLine();
			if(strnum(s)) {
				int idx = Integer.parseInt(s);
				sb.append(arr[idx-1]);
			}else {
				sb.append(map.get(s)+1);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	public static boolean strnum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

}
