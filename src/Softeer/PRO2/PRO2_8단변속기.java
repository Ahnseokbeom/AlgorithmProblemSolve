package Softeer.PRO2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PRO2_8단변속기 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[8];
	        for (int i = 0; i < 8; i++) arr[i] = sc.nextInt();
	        sc.close();
	        System.out.println(solution(arr));
    }
	 public static String solution(int[] arr) {
        boolean ascending = IntStream.range(0, 7).allMatch(i -> arr[i] < arr[i + 1]);
        boolean descending = IntStream.range(0, 7).allMatch(i -> arr[i] > arr[i + 1]);

        if (ascending) {
            return "ascending";
        } else if (descending) {
            return "descending";
        } else {
            return "mixed";
        }
    }
}
