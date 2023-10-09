package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRO2_단어필터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		String s1 = br.readLine();
		String s2 = br.readLine();
		System.out.println(solution(s, e, s1, s2));
	}
	public static String solution(int s, int e, String s1, String s2) {
		String answer = s2.replaceAll(s1, "");
		if(answer.equals("")) return "EMPTY";
		else return answer;
	}
}
