package goorm.PRO3;

import java.util.ArrayList;

public class PRO3_49096 {
	static ArrayList<int[]> list;
	public static void main(String[] args) {
        System.out.println(solution(5, 10, new int[] {5,3,7,2,1}));
        System.out.println(solution(7, 15, new int[] {4,9,11,8,5,6,10}));
        System.out.println(solution(10, 10, new int[] {9,9,5,2,8,8,10,9,4,6}));
    }
	public static int solution(int n, int m, int[] arr) {
		list = new ArrayList<>();
        for (int start = 0; start < n; start++) {
            int num = 0;
            int end = start;
            while (num < m) {
                if (end >= n) break;
                num += arr[end];
                end++;
            }
            if (num == m) {
                list.add(new int[]{start, end - 1});
            }
        }
        return list.size();
    }
}
