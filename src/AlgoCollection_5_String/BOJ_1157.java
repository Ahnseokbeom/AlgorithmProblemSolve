package AlgoCollection_5_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		int[] list = new int[26];
		HashMap<Integer, Character> map = new HashMap<>();
		for(int i = 0;i<s.length();i++) {
			list[s.charAt(i)-65]++;
			map.put(list[s.charAt(i)-65],s.charAt(i));
		}
		Arrays.sort(list);
		if(list[list.length-1]==list[list.length-2]) {
			System.out.println("?");
		}else {
			System.out.println(map.get(list[list.length-1]));
		}
		sc.close();
	}

}
