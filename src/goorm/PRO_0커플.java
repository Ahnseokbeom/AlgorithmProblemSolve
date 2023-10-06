package goorm;

import java.util.ArrayList;

public class PRO_0커플 {
	static int answer;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		System.out.println(solution(8, new int[] {1,2,3,4,-1,-2,-3,-5}));
		System.out.println(solution(8, new int[] {-1,1,2,-2,3,-3,4,5}));
	}
	public static int solution(int n, int[] arr) {
		answer = 0;
		list = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			if(list.isEmpty() || !list.contains(Math.abs(arr[i]))) list.add(arr[i]);
			else list.remove(list.indexOf(Math.abs(arr[i])));
		}
		System.out.println(list);
		for(int i = 0;i<list.size();i++) answer+=list.get(i);
		return answer;
	}
}
