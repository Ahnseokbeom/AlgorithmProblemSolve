package BOJ;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class BOJ_10867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> map = new TreeSet<>();
		for(int i = 0;i<n;i++) {
			map.add(sc.nextInt());
		}
		Iterator<Integer> it = map.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		sc.close();
	}

}
