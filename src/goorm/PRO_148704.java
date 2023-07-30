package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PRO_148704 {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	int n = Integer.parseInt(st.nextToken());
	int k = Integer.parseInt(st.nextToken());
	String[] arr = new String[n];
	for(int i = 0;i<n;i++) arr[i] = br.readLine();
	Arrays.sort(arr, (s1, s2) -> s1.length()- s2.length());
	System.out.println(arr[k-1]);
}
}
