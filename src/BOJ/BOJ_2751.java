package BOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] list = new String[n];

		for(int i = 0;i<n;i++) {
			list[i] = sc.next();
		}
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(list));
		String[] result = hashSet.toArray(new String[0]);
		System.out.println(Arrays.toString(result));
		sc.close();
	}

}
