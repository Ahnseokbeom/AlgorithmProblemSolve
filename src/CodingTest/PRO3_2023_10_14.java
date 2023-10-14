package CodingTest;

import java.util.PriorityQueue;

public class PRO3_2023_10_14 {
	public static void main(String[] args) {
		System.out.println(solution(2, new int[][] {{0,3},{2,5},{4,2},{5,3}}));
		System.out.println(solution(1, new int[][] {{2,3},{5,4},{6,3},{7,4}}));
	}
	public static int solution(int N, int[][] simulation_data) {
        int answer = 0;  // 전체 대기 시간 합을 저장할 변수
        int time = 0;    // 현재 시간을 나타내는 변수
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int[] data : simulation_data) {
            int arrivalTime = data[0];
            int serviceTime = data[1];
            time = Math.max(time, arrivalTime);
            if (queue.size() < N) {
                time += serviceTime;
                queue.offer(time);
            } else {
                int finish = queue.poll();
                time = finish + serviceTime;
                queue.offer(time);
            }

            answer = time - arrivalTime - N;
        }

        return answer;
    }
}
