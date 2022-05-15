package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//실패함
public class BOJ_2108 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mode = 5000;
		int median = 5000;
		for(int i = 0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			sum += a;
			list[a+4000]++;
			
			if(max < a) {
				max = a;
			}
			if(min > a) {
				min = a;
			}
		}
		
		int count  = 0; // 중앙값의 빈도수
		int mode_max = 0; // 최빈값의 최댓값
		
		//이전에 동일한 최빈값이 1번만 등장하면 true, 아니면 false
		boolean test = false;
		
		for(int i = min+4000;i<max+4000;i++) {
			if(list[i]>0) {
				// 중앙값 찾기
				//누적횟수가 전체 길이의 절반에 못 미친다면
				if(count<(n+1)/2) {
					count+= list[i]; // i값의 빈도수를 count에 누적
					median = i-4000;
				}
				// 최빈값 찾기
				//이전 최빈값보다 현재 값의 빈도수가 높다면
				if(mode_max < list[i]) {
					mode_max = list[i];
					mode = i-4000;
					test = true; // 첫 등장이므로 true
				//이전 최빈값 최댓값과 동일한 경우이면서 한번만 중복되는 경우
				}else if(mode_max == list[i] && test == true) {
					mode = i - 4000;
					test = false;
				}
			}
		}
		System.out.println(Math.round(sum/n)); // n개의 수들의 합을 n으로 나눈 값
		System.out.println(median); // 중앙값
		System.out.println(mode); // 최빈값
		System.out.println(max-min); // max-min
	}

}
