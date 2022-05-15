package programmers;

import java.util.ArrayList;

//1�� ������ - 12345 / 12345 / 12345
//2�� ������ - 2 1 2 3 2 4 2 5 / 2 1 2 3 2 4 2 5 
//3�� ������ - 3 3 1 1 2 2 4 4 5 5  / 3 3 1 1 2 2 4 4 5 5 
public class PRO_exam {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] p1 = {1,2,3,4,5}; //�̸�ŭ�� �ݺ�
	        int[] p2 = {2,1,2,3,2,4,2,5};
	        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
	        int re1=0, re2 =0, re3 =0;
	        
	        for(int i =0; i<answers.length; i++){//5,8,10���� ���� ������ ����ŭ �ݺ��ϱ� ����
	            if(p1[i%5] == answers[i]) re1++; // answer�� i�ε����� �����ڵ��� i�ε��� ��
	            if(p2[i%8] == answers[i]) re2++;
	            if(p3[i%10] == answers[i]) re3++;
	        }
	        int max = Math.max(Math.max(re1, re2),re3); // �ְ� ���ϱ�
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        if(max==re1) arr.add(1); //max���̶� ������ �ִ´�.
	        if(max==re2) arr.add(2); 
	        if(max==re3) arr.add(3);
	        
	        answer = new int[arr.size()]; // answer�� �ٽ� �ʱ�ȭ ���ش�.
	        
	        for(int i =0; i<answer.length; i++) { // ���� i �ε����� arr�� i �ε��� ����
	        	answer[i] = arr.get(i);
	        }
	        
	        return answer;
	    }
	}

}
