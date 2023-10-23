package goorm.PRO2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PRO2_이진수정렬 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1;i<=8;i++) list.add(i);
		System.out.println(solution(8, 6,list));
		list.clear();
		int idx = 1;
		for(int i = 1;i<=7;i++) {
			list.add(idx);
			idx*=2;
		}
		System.out.println(solution(7, 1, list));
	}
	public static int solution(int n, int k, List<Integer> list) {
		  Collections.sort(list, new Comparator<Integer>() {
	            @Override
	            public int compare(Integer a, Integer b) {
	                int countA = Integer.bitCount(a);
	                int countB = Integer.bitCount(b);

	                if (countA != countB) {
	                    return Integer.compare(countB, countA);
	                } else {
	                    return Integer.compare(b, a);
	                }
	            }
	        });
		  return list.get(k-1);
	}
}
