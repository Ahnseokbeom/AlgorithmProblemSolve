package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 1;

        while (a < b) {
            if (b % 2 == 0)b = b / 2;
            else {
                if (Integer.parseInt(Integer.toString(b).substring(Integer.toString(b).length() - 1)) == 1) {
                    b = Integer.parseInt(Integer.toString(b).substring(0, Integer.toString(b).length() - 1));
                }
                else break;
            }
            count++;
        }
        if (a == b) System.out.println(count);
        else System.out.println(-1);
    }

}
