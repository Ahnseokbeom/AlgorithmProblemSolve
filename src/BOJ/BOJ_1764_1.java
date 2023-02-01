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
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> arr = new ArrayList<String>();
		int n = Integer.parseInt(st.nextToken()); // ������ ���� ��� ��
		int m = Integer.parseInt(st.nextToken()); // ������ ���� ��� ��
		for(int i = 0;i<n;i++) {
			hs.add(br.readLine());
		}
		for(int i = 0;i<m;i++) {
			String s = br.readLine();
			if(hs.contains(s)) {
				arr.add(s);
			}
		}
		Collections.sort(arr);
		System.out.println(arr.size());
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
