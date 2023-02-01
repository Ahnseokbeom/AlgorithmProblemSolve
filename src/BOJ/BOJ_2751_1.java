package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2751_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(list);
		
		for(int a : list) {
			sb.append(a).append('\n');
		}
		System.out.println(sb);
	}

}
