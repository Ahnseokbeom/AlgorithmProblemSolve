package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888 {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] cal;
	static int[] number;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		number = new int[n];
		for(int i = 0;i<n;i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		cal = new int[4];
		for(int i = 0;i<4;i++) {
			cal[i] = Integer.parseInt(st.nextToken());
		}
		search(number[0],1);
		System.out.println(max+"\n"+min);
	}
	public static void search(int num, int idx) {
		if(idx==n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		for(int i = 0;i<4;i++) {
			if(cal[i] > 0) {
				cal[i]--;
				switch(i) {
				case 0: search(num+number[idx],idx+1); break;
				case 1: search(num-number[idx],idx+1); break;
				case 2: search(num*number[idx],idx+1); break;
				case 3: search(num/number[idx],idx+1); break;
				}
				cal[i]++;
			}
		}
	}

}
