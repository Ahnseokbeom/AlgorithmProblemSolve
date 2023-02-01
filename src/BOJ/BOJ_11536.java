package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11536 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i = 0;i<n;i++) {
			str[i] = br.readLine();
		}
		int num = 0;
		for(int i = 0;i<n-1;i++) {
			num+=str[i].compareTo(str[i+1])>0?1:-1;
			if(num==n-1) {
				System.out.println("DECREASING");
			}else if(num==1-n) {
				System.out.println("INCREASING");
			}else {
				System.out.println("NEITHER");
			}
		}
	}

}
