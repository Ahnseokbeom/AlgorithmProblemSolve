package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[1001];
		while(n-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		int pre = 0; // ���������� ���ð� ������
		int sum = 0; // ����� ���ð� ����
		for(int i = 0;i<1001;i++) {
			while(arr[i]-- > 0) {
				sum+=(i+pre);
				pre+=i;
			}
		}
		System.out.println(sum);
	}

}