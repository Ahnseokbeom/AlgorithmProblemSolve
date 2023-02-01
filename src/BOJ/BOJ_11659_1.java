package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken()); // �迭�� ũ��
		int m = Integer.parseInt(str.nextToken()); // �ݺ��� Ƚ��
		
		int arr[] = new int[n+1]; // �迭 ����
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int a = 1;a<=n;a++) { // �迭�� ��ū �߰�
			arr[a] = arr[a-1]+Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder(); // ���� ����
		for(int a = 0;a<m;a++) { // ������ ������ ����
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			sb.append(arr[j]-arr[i-1]+"\n");
		}
		System.out.println(sb); // ������ ���
	}

}
