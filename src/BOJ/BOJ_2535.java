package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_2535 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] stu = new int[n][3];
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			stu[i][0] = Integer.parseInt(st.nextToken());
			stu[i][1] = Integer.parseInt(st.nextToken());
			stu[i][2] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(stu,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[2]-o1[2];
			}
		});
		int[] list = new int[101];
		int res[][] = new int[3][2];
		int count = 0;
		for(int i = 0;i<n;i++) {
			if(i<2) {
				res[count][0] = stu[i][0];
				res[count][1] = stu[i][1];
				count++;
				list[stu[i][0]]++;
			}else if(list[stu[i][0]] >=2) {
				continue;
			}else {
				res[count][0] = stu[i][0];
				res[count][1] = stu[i][1];
				break;
			}
		}
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

	}
}
