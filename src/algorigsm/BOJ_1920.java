package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
	public static int[] list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		list = new int[n];
		for(int i = 0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		Arrays.sort(list);
		
		st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<m;i++) {
			if(search(Integer.parseInt(st.nextToken()))>=0) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int search(int key) {
		int low = 0; //왼쪽 끝 인덱스
		int high = list.length-1; // 오른쪽 끝 인덱스
		
		while(low <= high) {
			int mid = (low+high)/2; // 중간위치
			if(key < list[mid]) {//key값이 작을 경우
				high = mid-1; // 인덱스 오른쪽 끝 값을 중간위치-1로 변경해준다
			}
			else if(key > list[mid]) { // key 값이 클 경우
				low = mid+1;// 인덱스 왼쪽 끝 값을 중간위치 +1로 변경해준다
			}else { // key값이 중간값과 같을 경우
				return mid; 
			}
		}
		return -1; // 값이 존재하지 않을 경우
	}

}
