package programmers;

import java.util.Arrays;

public class PRO_3_NumberGame {
	public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0;
        int b = 0;
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[a] > B[b]) {
                b++;
            } else if (A[a] == B[b]) {
                b++;
            } else {
                a++;
                b++;
                answer++;
            }
        }
        return answer;
    }
}
