package SWMaestro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Truck {
	public static void main(String[] args) throws IOException{
		int[][] truck = {{2,3},{3,1},{2,2},{1,4}};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Arrays.sort(truck,(o1,o2)->{
			if(o1[0]==o2[0]) {
				return o2[1]-o1[1];
			}
			return o1[0]-o2[0];
		});
		int answer = 0;
		int i = 0;
		for(int t = 0;t<k;t++) {
			if(truck[i][0]==0) {
				i++;
			}
			truck[i][0]--;
			answer+=truck[i][1];
			System.out.println();
		}
		System.out.println(answer);
	}

}
