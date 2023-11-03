package Softeer.PRO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO3_성적평균 {
	public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      int[] arr = new int[n+1];
      st = new StringTokenizer(br.readLine());
      for(int i = 1;i<=n;i++) arr[i] = Integer.parseInt(st.nextToken());
      for(int i = 0;i<k;i++){
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int mod = b-a+1;
        int sum = 0;
        for(int j = a;j<=b;j++) sum+=arr[j];
        System.out.printf("%.2f\n",(float)sum/mod);
      }
    }
}
