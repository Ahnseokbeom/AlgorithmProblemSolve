package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1; // ���� ��
		int temp = 0; // �ڸ���
		int len = 10; // �� �ڸ������� �Ǵ�
		for(int i = 1;i<=n;i++) {
			if(i==len) { // �ڸ����� �ٲ��ش�(10 -> 100 -> 1000...��������)
				count++;
				len = len*10;
			}
			temp +=count;
		}
		System.out.println(temp);
	}

}
