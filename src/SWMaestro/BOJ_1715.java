package SWMaestro;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_1715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i = 0;i<n;i++) {
			pq.offer(sc.nextLong());
		}
		long sum = 0;
		while(pq.size()>1) {
			long a = pq.poll();
			long b = pq.poll();
			sum+=a+b;
			pq.offer(a+b);
		}
		sc.close();
		System.out.println(sum);
	}


}
