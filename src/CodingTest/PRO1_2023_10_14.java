package CodingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PRO1_2023_10_14 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2}, new int[] {1,3,2}));
		System.out.println(solution(new int[] {1,2,3,4}, new int[] {4,4,3,2,1}));
	}
	public static int solution(int[] books, int[] target) {
		 List<Integer> list = Arrays.stream(books).boxed().collect(Collectors.toList());
	        int answer = 0;
	        for(int i = 0;i<target.length;i++){
	            int idx = list.indexOf(target[i]);
	            System.out.println("idx : "+idx);
	            list.remove(idx);
	            list.add(0,target[i]);
	            System.out.println("list : "+list);
	            answer+=idx;
	        }
        return answer;
	}
}
