package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2110 {
	public static int[] house;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		house = new int[n];
		for(int i = 0;i<n;i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);

		int low = 1;
		int high = house[n-1] - house[0]+1;

		while(low < high) {
			int mid = (low + high) / 2;

			if(adjacency(mid) < c) {
				high = mid;
			}else {
				low = mid+1;
			}
		}
		System.out.println(low-1);

	}
	public static int adjacency(int num) {
		int count = 1;
		int install = house[0];

		for(int i = 1;i<house.length;i++) {
			int locate = house[i];

			if(locate - install >= num) {
				count++;
				install = locate;
			}
		}
		return count;
	}

}
