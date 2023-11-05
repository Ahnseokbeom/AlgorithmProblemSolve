package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PRO2_2023_11_04 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int h0 = Integer.parseInt(st.nextToken());
		int w0 = Integer.parseInt(st.nextToken());
		int h1 = Integer.parseInt(st.nextToken());
		int w1 = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[13];
		int x = h0;
		int y = w0;
		for(int i = 1;i<13;i++) {
			if(i<=3) {
				arr[i] = ItoS(x)+" "+ItoS(y)+" "+ItoS(x)+(2*r)+" "+ItoS(y)+(2*r);
				y+=(2*r)+w1;
			}else {
				String[] str = arr[i-3].split(" ");
				arr[i] = ItoS(StoI(str[0])+(2*r)+h1)+" "+ItoS(StoI(str[1])+(2*r))+" "+ItoS(StoI(str[2])+(2*r)+h1)+" "+ItoS(StoI(str[3])+(2*r));
				y+=(2*r)+w1;
			}
		}
		int count = 0;
		String key = "";
		Queue<String> q = new LinkedList<>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a < h0 || b < w0) continue;
			for(int j = 1;j<13;j++) {
				String[] str = arr[i].split(" ");
				if(StoI(str[0])<= a && a <= StoI(str[1]) && StoI(str[2]) <= a && a <= StoI(str[3])) {
					key+=ItoS(j);
					break;
				}
				if(j==10) {
					key = key.substring(0,key.length()-1);
				}
				if(j==12) {
					q.add(key);
					count++;
					key = "";
				}
			}
			System.out.println(count);
			while(!q.isEmpty()) System.out.println(q.remove());
		}
	}
	public static String ItoS(int n) {
		return String.valueOf(n);
	}
	public static int StoI(String s) {
		return Integer.parseInt(s);
	}
}
