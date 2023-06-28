package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = m;i<=n;i++) if(prime(i)==true) list.add(i);
		for(int i = 0;i<list.size();i++) System.out.println(list.get(i));
	}

	public static boolean prime(int n) {
		if(n<2) return false;
		if(n==2) return true;
		for(int i = 2;i<=Math.sqrt(n+1);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
