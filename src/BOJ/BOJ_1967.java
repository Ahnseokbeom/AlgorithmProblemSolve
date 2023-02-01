package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1967 {
	static LinkedList<Node> tree[];
    static int distance[], max, index;
    static boolean visit[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        tree = new LinkedList[n+1];
        distance = new int[n+1];
        visit = new boolean[n+1];
        for(int i = 0; i <= n; i++) { // n��ŭ ���ο� ��� ����
            tree[i] = new LinkedList<>();
        }
        for(int i = 0; i < n-1; i++) { // Ʈ�� �Է� �ޱ�(�Է� ���� ���� Ʈ���� ����)
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()); // �θ���
            int c = Integer.parseInt(st.nextToken()); // �ڽĳ��
            int w = Integer.parseInt(st.nextToken()); // ����ġ
            tree[p].add(new Node(c, w));
            tree[c].add(new Node(p, w));
        }
        if(n > 1) { // ��尡 1������ ���� ��
            dfs(1, 0);
            visit = new boolean[n+1];
            distance = new int[n+1];
            dfs(index, 0);
            System.out.println(max);
        }
        else
            System.out.println(0);
    }
    
    public static void dfs(int node, int weight) {
        distance[node] = weight;
        visit[node] = true;
        if(weight > max) { // �־��� ����ġ�� max���� ũ�� ����ġ�� max�� ���� / index��ȣ�� ����ġ�� �´� ������ȣ ����
            max = weight;
            index = node;
        }
        for(Node next : tree[node]) {
            if(!visit[next.number]) // �湮���� ���� ���̶�� �ٽ� ���ȣ��
                dfs(next.number, weight + next.weight);
        }
    }
    
    static class Node { // Ʈ���� ������ ����ġ�� ����� node ����
        int number, weight;
        
        Node(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    }
}
