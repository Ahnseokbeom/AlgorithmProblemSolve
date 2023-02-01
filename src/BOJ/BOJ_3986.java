package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3986 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0;i<n;i++) {
			String str = br.readLine();
			int len = str.length();
			char[] ch = new char[len];
			int size = 0;
			for(int j = 0;j<len;j++) {
				char cha = str.charAt(j);
				if(size==0) {
					ch[size] = cha;
					size++;
				}else if(ch[size-1]==cha) {
					size--;
				}else {
					ch[size] = cha;
					size++;
				}
			}
			if(size == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
