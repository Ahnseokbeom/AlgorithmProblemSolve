package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//1 - 6�� / 2 - 5�� / 3 - 4�� / 4 - 3�� / 5 - 2�� / 6 �� ��
public class PRO_Lotto {
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	    	int[] answer = {};
	    	int zero = 0; // 0�� ����
	    	int count = 0; // ���� ����
	    	int[] arr = {6,6,5,4,3,2,1};
	    	Arrays.sort(lottos); // �������� ����
	    	Arrays.sort(win_nums); // �������� ����
	    	
	    	for(int i = 0;i<lottos.length;i++) { // �˾ƺ� �� ���� ��ȣ
	    		if(lottos[i]==0) {
	    			zero++;
	    			continue;
	    		}
	    		for(int j = 0;j<win_nums.length;j++) { // �� �ζǹ�ȣ�� ��÷��ȣ�� �����ϸ� 1 ����
	    			if(lottos[i]==win_nums[j]) {
	    				count++;	
	    				break;
	    			}
	    		}
	    	}
	    	ArrayList<Integer> list = new ArrayList<Integer>(); // list ����
	    	list.add(arr[zero+count]); // �ִ����
	    	list.add(arr[count]); // �ּҼ���
	    	answer = new int[list.size()]; // answer �� �ʱ�ȭ
	    	for(int i = 0;i<answer.length;i++) { // answer�� �� �߰�
	    		answer[i] = list.get(i);
	    	}
	    	return answer; // ���
	    	}
	    	
	    }
	}

