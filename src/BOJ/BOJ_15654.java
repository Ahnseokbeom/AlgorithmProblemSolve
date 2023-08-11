package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15654 {
	static int n, m;
    static int[] answer, arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        answer = new int[m];
        check = new boolean[n];

        arr=new int[n];

        st= new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int num){

        if(num == m){
            for(int i:answer)sb.append(i).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++){
            if(!check[i]){
                check[i] = true;
                answer[num] = arr[i];
                dfs(num+1);
                check[i]=false;
            }
        }

    }

}
