package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11478 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		HashSet<String> set = new HashSet<>();
		String name = "";
		for(int i = 0;i<s.length();i++) {
			name = "";
			for(int j = i;j<s.length();j++) {
				name+=s.substring(j,j+1);
				set.add(name);
			}
		}
		System.out.println(set.size());
	}

}
