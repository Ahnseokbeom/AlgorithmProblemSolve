package algorigsm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_1300 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 배열의 크기
		int n = Integer.parseInt(br.readLine());
		// 찾고하자하는 값의 인덱스 번호
		int k = Integer.parseInt(br.readLine());
		int[][] a = new int[n][n];
		int[] b = new int[n*n];
		int c = 0;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				a[i-1][j-1] = i*j;
				b[c++] = i*j;
			}
		}
		Arrays.sort(b);
		bw.write(b[k]+"\n");
		bw.flush();
		bw.close();

	}

}
