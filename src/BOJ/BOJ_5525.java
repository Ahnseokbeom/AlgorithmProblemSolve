package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5525 {
	public static void main(String[] args) throws IOException{
		BufferedReader 	br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String st;
		int count = 0;
		st = br.readLine();
		for(int i = 0;i<m;i++) {
			if(i==m-IOI(n).length()) {
				break;
			}
			else if(st.substring(i, i+(IOI(n).length())).equals(IOI(n))) {
				count++;
			}
		}
		System.out.println(count);

	}
	static String IOI(int n) {
		String st = "OI";
		String str = "IOI";
		if(n==1) {
			return str;
		}else {
			for(int i = 0;i<n-1;i++) {
				str+=st;
			}
		}
		return str;
	}

}
