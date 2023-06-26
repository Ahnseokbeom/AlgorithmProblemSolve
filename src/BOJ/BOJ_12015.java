package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_12015 {
	static ArrayList<Integer> list;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		list = new ArrayList<>();
		list.add(0);

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(BinarySearch(n));
	}
	public static int BinarySearch(int n) {
		for(int i = 0;i<n;i++) {
			if(list.get(list.size()-1)<arr[i]) list.add(arr[i]);
			else {
				int left = 1;
				int right = list.size()-1;
				while(left < right) {
					int mid = (left+right)/2;
					if(list.get(mid) < arr[i]) {
						left = mid+1;
					}else {
						right = mid;
					}
				}
				list.set(right, arr[i]);
			}
		}
		System.out.println(list);
		return list.size()-1;
	}
}
