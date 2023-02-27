package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PRO_2_MandarinSelect {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for(int size : tangerine) map.put(size, map.getOrDefault(size, 0)+1);

		ArrayList<Integer> list = new ArrayList<>(map.keySet());

		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = map.get(o1);
				int b = map.get(o2);
				if(a==b) return 0;
				else if (a < b) return 1;
				else return -1;
			}
		});

		int i = 0;
		while(k>0) {
			k -= map.get(list.get(i));
			answer++;
			i++;
		}
		return answer;
	}
}
