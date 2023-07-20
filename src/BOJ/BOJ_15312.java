package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_15312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String st = "";
        int[] arr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String score = "";
        for (int i = 0; i < a.length(); i++) {
            st += a.charAt(i);
            st += b.charAt(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (char c : st.toCharArray()) {
            list.add(arr[c - 65]);
        }
        while (true) {
            if (list.size() == 2) {
                score = Integer.toString(list.get(0)).substring(1) + Integer.toString(list.get(1)).substring(1);
                break;
            }
            ArrayList<Integer> plus = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) + list.get(i + 1) >= 10) {
                    plus.add((list.get(i) + list.get(i + 1)) % 10);
                } else {
                    plus.add(list.get(i) + list.get(i + 1));
                }
            }
            list = plus;
        }
        sc.close();
        int answer = 0;
        answer+=list.get(0)*10 + list.get(1);
        System.out.println(answer);
	}

}
