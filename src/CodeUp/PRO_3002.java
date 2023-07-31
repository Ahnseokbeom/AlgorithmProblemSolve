package CodeUp;

import java.util.HashMap;
import java.util.Scanner;

public class PRO_3002 {
	static HashMap<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			map.put(sc.nextInt(), i+1);
		}
		int m = sc.nextInt();
		for(int i = 0;i<m;i++) {
			int num = sc.nextInt();
			if(map.containsKey(num)) System.out.print(map.get(num)+" ");
			else System.out.print(-1+" ");
		}
		sc.close();
	}
}
