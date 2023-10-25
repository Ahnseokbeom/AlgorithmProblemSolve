package goorm.PRO4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PRO4_해외여행 {
	static class Edge {
	    int end;
	    long weight;

	    public Edge(int end, long weight) {
	        this.end = end;
	        this.weight = weight;
	    }
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Edge>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.get(a).add(new Edge(b, w));
        }

        long minCost = solution(list, n);
        System.out.println(minCost==Long.MAX_VALUE?"go home":minCost);
	}
	 public static long solution(List<List<Edge>> list, int n) {
        long[] cost = new long[n + 1];
        Arrays.fill(cost, Long.MAX_VALUE);
        cost[1] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(e -> e.weight));
        pq.add(new Edge(1, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if (current.weight > cost[current.end]) continue;

            for (Edge country : list.get(current.end)) {
                long newCost = cost[current.end] + country.weight;
                if (newCost < cost[country.end]) {
                    cost[country.end] = newCost;
                    pq.add(new Edge(country.end, newCost));
                }
            }
        }

        return cost[n];
    }
}
