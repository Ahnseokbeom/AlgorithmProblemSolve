package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringBackTracking {
	static int n, m;
	static int[] arr;
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n];
        dfs(1,0);
        System.out.println(sb.toString());
    }
    public static void dfs(int start,int num) {
    	if(num==m) {
    		for(int i : arr) sb.append(i+" ");
    		sb.append("\n"); return;
    	}
    	for(int i = start;i<n;i++) {
			arr[num] = i+1;
			dfs(i,num+1);
    	}
    }
}
