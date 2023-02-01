package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1168_2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) - 1;

        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            a.add(i);
        }

        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n - 1; i++) {
            index += k;

            if (index >= a.size()) {
                index %= a.size();
            }

            sb.append(a.remove(index) + ", ");
        }
        sb.append(a.remove(0) + ">");

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
