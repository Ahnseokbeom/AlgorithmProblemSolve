package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());// ��ǰ �ݾ�
		int result = 1000-cost; // ���� �ݾ� - ��ǰ �ݾ�
		int[] arr = {500,100,50,10,5,1}; // �ܵ� ����Ʈ
		int sum = 0; // �� ����
		for(int i = 0;i<arr.length;i++) {//����Ʈ �� �������� �ݺ�
			if(result/arr[i] > 0) {
				sum += result/arr[i];
				result = result%arr[i];
			}
		}
		System.out.println(sum);
	}

}
