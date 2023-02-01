package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1300 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 배열의 크기
		int n = Integer.parseInt(br.readLine());
		// 찾고하자하는 값의 인덱스 번호
		int k = Integer.parseInt(br.readLine());
		int result = 0;
		int start = 1;
		int end = k;
		while(start <= end) {
			int mid = (start+end)/2;
			long count = 0;

			for(int i = 1;i<=n;i++) {
				count += Math.min(mid/i,n);
			}
			if(count < k) {
				start = mid+1;
			}else {
				end = mid - 1;
				result = mid;
			}
		}
		bw.write(result+"\n");
		bw.flush();
		bw.close();

	}

}
