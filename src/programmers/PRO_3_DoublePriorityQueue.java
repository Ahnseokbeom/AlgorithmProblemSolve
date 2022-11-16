package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class PRO_3_DoublePriorityQueue {
	public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        String[] temp;
        for(int i = 0 ; i < operations.length;i++){
            temp = operations[i].split(" ");
            if(pq1.size()==0 && temp[0].equals("D"))continue;
            if(temp[0].equals("I")){
                pq1.add(Integer.parseInt(temp[1]));
                pq2.add(Integer.parseInt(temp[1]));
            }else if(temp[0].equals("D")&&temp[1].equals("1")){
                int max = pq2.poll();
                pq1.remove(max);
            }else if(temp[0].equals("D")&&temp[1].equals("-1")){
                int min = pq1.poll();
                pq2.remove(min);
            }
        }
        if(pq1.size()>0){
            answer[0]=pq2.poll();
            answer[1]=pq1.poll();
        }

        return answer;
    }
}
