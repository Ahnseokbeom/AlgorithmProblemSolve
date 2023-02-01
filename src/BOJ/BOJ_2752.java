package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2752 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int j = 0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
