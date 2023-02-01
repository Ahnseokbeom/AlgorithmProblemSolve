package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_11723 {

	public static void main(String[] args) throws IOException{
		HashSet<Integer> set = new HashSet<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<m;i++) {
			String s = br.readLine();
			switch(s.split(" ")[0]) {
			case "add": set.add(Integer.parseInt(s.split(" ")[1])); break;
			case "remove" : set.remove(Integer.parseInt(s.split(" ")[1])); break;
			case "check" : if(set.contains(Integer.parseInt(s.split(" ")[1]))) {
				sb.append(1+"\n");
				break;
			}else {
				sb.append(0+"\n");
				break;
			}
			case "toggle" : if(set.contains(Integer.parseInt(s.split(" ")[1]))) {
				set.remove(Integer.parseInt(s.split(" ")[1]));
				break;
			}else {
				set.add(Integer.parseInt(s.split(" ")[1]));
				break;
			}
			case "all":set.clear();
			for(int j = 1;j<=20;j++) {
				set.add(j);
			}
			System.out.println(set);
			break;
			case "empty":set.clear(); break;
			}
		}
		System.out.println(sb);
	}

}
