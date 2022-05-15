package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1; // 더할 값
		int temp = 0; // 자릿수
		int len = 10; // 몇 자리수인지 판단
		for(int i = 1;i<=n;i++) {
			if(i==len) { // 자릿수를 바꿔준다(10 -> 100 -> 1000...단위마다)
				count++;
				len = len*10;
			}
			temp +=count;
		}
		System.out.println(temp);
	}

}
