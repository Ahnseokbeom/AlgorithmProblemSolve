package goorm.PRO3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PRO3_개발자지망생구름이의취업뽀개기 {
	private static final int LEVELS = 5;
    private static final int HOUR = 60;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= LEVELS; i++) map.put(i, new ArrayList<>());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int[] arr = new int[LEVELS + 1];
        for (int i = 1; i <= LEVELS; i++) arr[i] = Integer.parseInt(tokenizer.nextToken());

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int level = Integer.parseInt(tokenizer.nextToken());
            int time = Integer.parseInt(tokenizer.nextToken());
            map.get(level).add(time);
        }

        int sum = calculateTime(arr, map);
        System.out.println(sum + (HOUR * (LEVELS - 1)));
    }

    private static int calculateTime(int[] arr, Map<Integer, List<Integer>> map) {
        int sum = 0;
        for (int i = 1; i <= LEVELS; i++) {
            List<Integer> times = map.get(i);
            Collections.sort(times);
            for (int j = 0; j < arr[i]; j++) {
                sum += times.get(j);

                if (j > 0 && times.get(j) > times.get(j - 1)) {
                    sum += times.get(j) - times.get(j - 1);
                }
            }
        }
        return sum;
    }
}
