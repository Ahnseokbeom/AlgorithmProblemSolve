package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z'){
                c += 13;
                if (c>'z'){
                    int tmp = c - 'z';
                    c = 'a'-1;
                    c += tmp;
                }
            } else if (c>='A' && c<='Z'){
                c += 13;
                if (c>'Z'){
                    int tmp = c - 'Z';
                    c = 'A'-1;
                    c += tmp;
                }
            }
            sb.append(c);
		}
		System.out.println(sb);
	}

}
