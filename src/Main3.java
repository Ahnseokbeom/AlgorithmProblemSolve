import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException{
		String[] list = {"ENFJ","ENFP","ENTJ","ENTP","ESFJ","ESFP","ESTJ","ESTP","INFJ","INFP","INTJ","INTP","ISFJ","ISFP","ISTJ","ISTP"};
		String s = "ESTJINFP";
		System.out.println(list.length);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 1;i<=t;i++) {
			Queue<Character> q = new LinkedList<>();
			long result = 0;
			int n = Integer.parseInt(br.readLine());
			for(int qu = 0;qu<n;qu++) {
				for(int snum = 0;snum<s.length();snum++) {
					q.offer(s.charAt(snum));
				}
			}
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int[] amount = new int[16];
			for(int j = 0;j<16;j++) {
				amount[j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
