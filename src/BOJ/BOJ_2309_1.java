package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2309_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int result = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<9;i++) {
			list.add(sc.nextInt());
			sum += list.get(i);
		}
		sc.close();
		Collections.sort(list);
		result = sum - 100;
		for(int i = 0;i<list.size();i++) {
			for(int j = i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j) == result) {
					list.remove(i);
					list.remove(j-1);
					break;
				}
			}
		}
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
