package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class BOJ_11652 {
	public static void main(String[] args) throws IOException{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i<n;i++) {
			pq.offer(Integer.parseInt(br.readLine()));
			if(map.containsKey(i)) {
				map.replace(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		int max = 0;
		for(int a : map.keySet()) {
			max = Math.max(max, map.get(a));
		}
		ArrayList<Integer> arr = new ArrayList<Integer>(map.keySet());
		Collections.sort(arr);
		for(int i : arr) {
			if(map.get(i)==max) {
				System.out.println(i);
				break;
			}
		}
	}

}
