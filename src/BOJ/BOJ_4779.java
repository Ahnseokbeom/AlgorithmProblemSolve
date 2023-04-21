package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4779 {
	static StringBuilder sb;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			n = Integer.parseInt(str);
			sb = new StringBuilder();
			int len = (int) Math.pow(3, n);
			for (int i = 0; i < len; i++)sb.append("-");
			rec(0,len);
			System.out.println(sb);
		}



	}
	public static void rec(int start, int size) {
		if(size==1) return;
		int Size = size/3;
		for(int i = start+Size;i<start+2*Size;i++) sb.setCharAt(i, ' ');
		rec(start,Size);
		rec(start+2*Size,Size);
	}

}
