package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());// 물품 금액
		int result = 1000-cost; // 지불 금액 - 물품 금액
		int[] arr = {500,100,50,10,5,1}; // 잔돈 리스트
		int sum = 0; // 총 갯수
		for(int i = 0;i<arr.length;i++) {//리스트 다 돌때까지 반복
			if(result/arr[i] > 0) {
				sum += result/arr[i];
				result = result%arr[i];
			}
		}
		System.out.println(sum);
	}

}
