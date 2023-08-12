package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1946 {
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		while(t-->0) {
			int answer = 1;
			int n = Integer.parseInt(br.readLine());
			arr = new int[n][2];
			for(int i = 0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, (o1,o2)->{
				return o1[0]-o2[0];
			});
			int num = arr[0][1];
			for(int i = 0;i<arr.length;i++) {
				if(arr[i][1] < num) {
					num = arr[i][1];
					answer++;
				}
			}
			System.out.println(answer);
		}

	}

}
