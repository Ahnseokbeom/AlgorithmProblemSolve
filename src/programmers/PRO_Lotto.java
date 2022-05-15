package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//1 - 6개 / 2 - 5개 / 3 - 4개 / 4 - 3개 / 5 - 2개 / 6 그 외
public class PRO_Lotto {
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	    	int[] answer = {};
	    	int zero = 0; // 0의 개수
	    	int count = 0; // 맞은 개수
	    	int[] arr = {6,6,5,4,3,2,1};
	    	Arrays.sort(lottos); // 오름차순 정렬
	    	Arrays.sort(win_nums); // 오름차순 정렬
	    	
	    	for(int i = 0;i<lottos.length;i++) { // 알아볼 수 없는 번호
	    		if(lottos[i]==0) {
	    			zero++;
	    			continue;
	    		}
	    		for(int j = 0;j<win_nums.length;j++) { // 내 로또번호와 당첨번호가 동일하면 1 증가
	    			if(lottos[i]==win_nums[j]) {
	    				count++;	
	    				break;
	    			}
	    		}
	    	}
	    	ArrayList<Integer> list = new ArrayList<Integer>(); // list 생성
	    	list.add(arr[zero+count]); // 최대순위
	    	list.add(arr[count]); // 최소순위
	    	answer = new int[list.size()]; // answer 재 초기화
	    	for(int i = 0;i<answer.length;i++) { // answer의 값 추가
	    		answer[i] = list.get(i);
	    	}
	    	return answer; // 출력
	    	}
	    	
	    }
	}

