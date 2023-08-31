package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class PRO2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[][] {{1,4},{3,4},{3,10}})));
		System.out.println(Arrays.toString(solution(new int[][] {{1,1},{2,2},{1,2}})));
	}
	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(v[0][0]);
		list2.add(v[0][1]);
		for(int i = 1;i<v.length;i++) {
			int n1 = v[i][0];
			int n2 = v[i][1];
			if(list1.contains(n1)) list1.remove(list1.indexOf(n1));
			else list1.add(n1);
			if(list2.contains(n2)) list2.remove(list2.indexOf(n2));
			else list2.add(n2);
		}
		answer[0] = list1.get(0);
		answer[1] = list2.get(0);
		return answer;
	}
}