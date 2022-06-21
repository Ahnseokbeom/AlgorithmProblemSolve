package AlgoCollection_1_If;

import java.util.Scanner;

public class BOJ_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if(n>=90) {
			sb.append("A");
		}else if(n>=80) {
			sb.append("B");
		}else if(n>=70) {
			sb.append("C");
		}else if(n>=60) {
			sb.append("D");
		}else {
			sb.append("F");
		}
		System.out.println(sb);
		sc.close();
	}
}
