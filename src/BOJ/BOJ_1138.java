package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1138 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer> arr =new ArrayList<>();
		int[] people = new int[n+1];
		for(int i = 1;i<=n;i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = n;i>=1;i--) {
			arr.add(people[i],i);
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
