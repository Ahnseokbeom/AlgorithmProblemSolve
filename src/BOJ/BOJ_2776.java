package BOJ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_2776 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		HashMap<Integer, Integer> amap = new HashMap<>();
		for(int i = 0;i<n;i++) {
			amap.put(i, sc.nextInt());
		}
		int m = sc.nextInt();
		for(int i = 0;i<m;i++) {
			if(amap.containsValue(sc.nextInt())) {
				bw.write(String.valueOf(1)+"\n");
			}else {
				bw.write(String.valueOf(0)+"\n");
			}
		}
		}
		bw.close();
		sc.close();
	}

}
