package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13900 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] list = br.readLine().split(" ");
		int sum = 0;
		for(int i = 0;i<n;i++) {
			int tempSum = 0;
			for(int j = i+1;j<n;j++) {
				tempSum += Integer.parseInt(list[j]);
			}
			sum += Integer.parseInt(list[i])*tempSum;
		}
		System.out.println(sum);
	}

}
