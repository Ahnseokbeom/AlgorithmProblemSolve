package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20164 {
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cut(n,odd(n));
        System.out.println(min+" "+max);
    }
    static void cut(int n, int total){
        // 한자리
        if(n < 10){
            min = Math.min(min,total);
            max = Math.max(max,total);
        }

        // 두자리
        else if(n < 100){
            int sum = (n / 10) + (n % 10);
            cut(sum,total+odd(sum));
        }

        else{
            String str = Integer.toString(n);
            int len = str.length();
            for(int i = 0; i <= len-3; ++i)
            {
                for(int j = i+1; j <= len-2; ++j)
                {
                    String s1 = str.substring(0,i+1);
                    String s2 = str.substring(i+1,j+1);
                    String s3 = str.substring(j+1,len);

                    int sum = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
                    cut(sum,total+odd(sum));
                }
            }
        }
    }
    static int odd(int n){
        int count = 0;

        while(n > 0){
            //자릿수
            int cur = n % 10;
            if((cur % 2) == 1) count++;
            n /= 10;
        }
        return count;
    }

}
