package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) { // ���� �ݺ�
			int count = 0; // �Ҽ��� ������ ���� ����
			int n = Integer.parseInt(br.readLine()); // n �Է�
			if(n==0) break; // n�� 0�̸� while�� ����
			for(int i = n+1;i<=n*2;i++){ // n+1 ~2n������ �Ҽ� ã��
				if(prime(i)==true) {
					count++;
				}
			}
			System.out.println(count); // �Ҽ� ���� ���
		}
	}
	public static boolean prime(int n) { // �Ҽ� ���ϴ� �Լ�
		if(n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i = 2;i<=Math.sqrt(n+1);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
