package SWMaestro;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_3 {
	// n k int[][]
	// 0 - 입구 1 - 출구
	// 사람 입장 시(입구, 출구 노상관) k만큼 회전문 회전 회전 안 할 시에는 안에 사람 모두 정지
	// 회전문 안에 사람이 있고, 뒤에 들어올 사람이 없으면 -1 return
	// 퇴장 방법 : n/2만큼 이동하면 퇴장 가능
	public static int[] solution(int n, int k, int[][] arr) {
		int[] answer = new int[arr.length];
		Queue<Integer> q = new LinkedList<>();
		int time = 0;
		while(true) {
			int rotation = arr[0][0]+k;
			for(int i = 0;i<arr.length;i++) {
				if(rotation <= arr[i][0]) {

				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 4;
		int k = 5;
		int[][] arr = {{1,0},{5,1},{6,1},{10,0},{17,0}};
		System.out.println(solution(n,k,arr));

	}

}
