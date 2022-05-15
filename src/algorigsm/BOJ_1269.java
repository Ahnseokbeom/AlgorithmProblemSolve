package algorigsm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1269 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		HashMap<Integer, Integer> a_map = new HashMap<>();
		HashMap<Integer, Integer> b_map = new HashMap<>();
		for(int i = 0;i<a;i++) {
			a_map.put(i, sc.nextInt());
		}
		for(int j = 0;j<b;j++) {
			b_map.put(j, sc.nextInt());
		}
		int a_plus = 0;
		int b_plus = 0;
		for(int i = 0;i<a;i++) {
			if(b_map.containsValue(a_map.get(i))) {
				a_plus++;
			}
		}
		for(int i = 0;i<b;i++) {
			if(a_map.containsValue(b_map.get(i))) {
				b_plus++;
			}
		}
//		sc.close();
		int count = a+b;
		System.out.println(count-a_plus-b_plus);

	}

}
