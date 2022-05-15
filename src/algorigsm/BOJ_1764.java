package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//실패(시간초과 - 2초)
public class BOJ_1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
		int m = Integer.parseInt(st.nextToken()); // 보지도 못한 사람 수
		String[] Nlist = new String[n];
		String[] Mlist = new String[m];
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0;i<n;i++) { // 듣지 못한 사람 
			st = new StringTokenizer(br.readLine());
			Nlist[i] = st.nextToken();
		}
		
		for(int i = 0;i<m;i++) { // 보지 못한 사람
			st = new StringTokenizer(br.readLine());
			Mlist[i] = st.nextToken();
		}
		int count = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(Nlist[i].equals(Mlist[j])) {
					count++;
					list.add(Mlist[j]);
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
