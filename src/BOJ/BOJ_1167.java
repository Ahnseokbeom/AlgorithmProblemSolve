package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1167 {

    static ArrayList<Node>[] list;
    static boolean[] check;
    static int max = 0;
    static int node;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        list = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            while(true) {
                int e = sc.nextInt();
                if(e == -1) break;
                int cost = sc.nextInt();
                list[s].add(new Node(e, cost));
            }
        }

        check = new boolean[n + 1];
        dfs(1, 0);

        check = new boolean[n + 1];
        dfs(node, 0);

        System.out.println(max);
        sc.close();
    }

    public static void dfs(int x, int len) {
        if(len > max) {
            max = len;
            node = x;
        }
        check[x] = true;

        for(int i = 0; i < list[x].size(); i++) {
            Node n = list[x].get(i);
            if(check[n.edge] == false) {
                dfs(n.edge, n.cost + len);
                check[n.edge] = true;
            }
        }

    }

    public static class Node {
        int edge;
        int cost;

        public Node(int edge, int cost) {
            this.edge = edge;
            this.cost = cost;
        }
    }
}