package BOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_13265 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < t; i++) {
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            List<List<Integer>> list = new ArrayList<>();
	            for (int j = 0; j <= n; j++) {
	                list.add(new ArrayList<>());
	            }

	            for (int k = 0; k < m; k++) {
	                int n1 = sc.nextInt();
	                int n2 = sc.nextInt();
	                list.get(n1).add(n2);
	                list.get(n2).add(n1);
	            }

	            int[] chk = new int[n+1];
	            String result = "possible";

	            for (int number = 1; number <= n; number++) {
	                if (chk[number] == 0) {
	                    Stack<int[]> stack = new Stack<>();
	                    stack.push(new int[]{number, 1});

	                    while (!stack.isEmpty()) {
	                        int[] pair = stack.pop();
	                        int cn = pair[0];
	                        int nc = pair[1];

	                        if (chk[cn] != 0 && chk[cn] != nc) {
	                            result = "impossible";
	                            break;
	                        }

	                        chk[cn] = nc;

	                        for (int nn : list.get(cn)) {
	                            if (chk[nn] == 0) {
	                                stack.push(new int[]{nn, -nc});
	                            }
	                        }
	                    }

	                    if (result.equals("impossible")) {
	                        sb.append(result).append("\n");
	                        break;
	                    }
	                }
	            }

	            if (result.equals("possible")) {
	                sb.append(result).append("\n");
	            }
	        }
	        sc.close();
	        System.out.print(sb.toString());
	    }

}
