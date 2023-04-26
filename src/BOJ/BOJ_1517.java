package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1517 {
	static long[] map;
	static long[] temp;
	static int n;
	static long count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		map = new long[n];
		temp = new long[n];
		for(int i = 0;i<n;i++) map[i] = Long.parseLong(st.nextToken());

		mergeSort(0,n-1);
		System.out.println(count);

	}
	public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    public static void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (map[i] <= map[j]) {
                temp[k] = map[i];
                i++;

            } else {
                count += mid - i + 1;
                temp[k] = map[j];
                j++;

            }
            k++;
        }
        if (i > mid) {
            for (int t = j; t <= right; t++) {
                temp[k] = map[t];
                k++;
            }
        } else {
            for (int t = i; t <= mid; t++) {
                temp[k] = map[t];
                k++;
            }
        }
        for (int t = left; t <= right; t++) map[t] = temp[t];
    }

}
