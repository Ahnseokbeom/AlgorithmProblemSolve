package Softeer.PRO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Gbc{
	private int size;
	private int speed;
	public Gbc(int size, int speed) {
		this.size=size;
		this.speed=speed;
	}
	public int getSize() {
		return size;
	}
	public int getSpeed() {
		return speed;
	}
}
public class PRO2_6270 {
	public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      List<Gbc> list1 = new ArrayList<>();
      List<Gbc> list2 = new ArrayList<>();
      for(int i = 0;i<n;i++) {
    	  st = new StringTokenizer(br.readLine());
    	  list1.add(new Gbc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
      }
      for(int i = 0;i<m;i++) {
    	  st = new StringTokenizer(br.readLine());
    	  list2.add(new Gbc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
      }
      int[] Narr = arr(list1);
      int[] Marr = arr(list2);
      System.out.println(solution(Narr, Marr));
    }
	public static int[] arr(List<Gbc> list) {
		int[] answer = new int[100];
		int left = 0;
		for(Gbc gbc : list) {
			int right = left+gbc.getSize();
			for(int i = left;i<right;i++) {
				answer[i] = gbc.getSpeed();
			}
			left+=gbc.getSize();
		}
		return answer;
	}
	public static int solution(int[] Narr, int[] Marr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<100;i++) {
    	  max = Math.max((Marr[i]-Narr[i])<0?0:Marr[i]-Narr[i], max);
		}
      return max;
	}
}
