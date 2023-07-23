package CodeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRO_4031 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<7;i++) {
			int n = sc.nextInt();
			if(check(n)) list1.add(n);
			else list2.add(n);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.isEmpty()) System.out.println(list2.get(list2.size()-1));
		else if(list2.isEmpty()) System.out.println(list1.get(list1.size()-1));
		else System.out.println(list1.get(list1.size()-1)+list2.get(list2.size()-1));
		sc.close();
	}
	public static boolean check(int n) {
		return n%2==0 ? true:false;
	}
}
