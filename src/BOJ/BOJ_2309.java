package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i = 0;i<9;i++) {
			list.add(sc.nextInt());
			sum+=list.get(i);
		}
		sc.close();
		
		Collections.sort(list);
		int result = sum-100;
		for(int i = 0;i<list.size();i++) {
			for(int j = i+1;j<list.size();j++) {
				if(result==list.get(i)+list.get(j)) {
					list.remove(i);
					list.remove(j-1);
					break;
				}
			}
		}
			
		for(int k = 0;k<list.size();k++) {
			System.out.println(list.get(k));
		}
	}

}
