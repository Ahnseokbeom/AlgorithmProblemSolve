package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_10709 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] sky = new char[h][w];

        for (int i = 0; i < h; i++) {
            String input = br.readLine();
            for (int j = 0; j < w; j++) {
                sky[i][j] = input.charAt(j);
            }
        }

        int[][] result = new int[h][w];

        int count = 0;
        boolean first_c_flag = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j == 0 && sky[i][j] != 'c') {
                    first_c_flag = false;
                }

                if (sky[i][j] == 'c') {
                    count = 0;
                    result[i][j] = 0;
                    first_c_flag = true;
                }

                if (!first_c_flag) {
                    result[i][j] = -1;
                    continue;
                }

                if (sky[i][j] == '.') {
                    result[i][j] = count;
                }

                count += 1;
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
