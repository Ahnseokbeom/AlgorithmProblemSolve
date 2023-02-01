package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10610 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String[] str = n.split("");
		int sum = 0;
		int[] list = new int[10];
		for(int i = 0;i<str.length;i++) {
			sum+= Integer.parseInt(str[i]);
			list[Integer.parseInt(str[i])] += 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = list.length-1;i>=0;i--) {
			if(list[i]==1) {
				sb.append(i);
			}else if(list[i]>=2) {
				for(int j = 0;j<list[i];j++) {
					sb.append(i);
				}
			}
		}
		if(sum%3==0 && n.contains("0")) {
			System.out.println(sb);
		}else {
			System.out.println(-1);
		}

	}

}
