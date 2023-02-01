package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] list =  new int[30];
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0;i<28;i++) {
			int n = sc.nextInt();
			map.put(n, n);
		}
		for(int i = 1;i<=30;i++) {
			list[i-1] = i;
			if(!map.containsValue(i)) {
				result.add(i);
			}
		}
		sc.close();
		Collections.sort(result);
		for(int i = 0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}

}
