package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//������
public class BOJ_2108 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mode = 5000;
		int median = 5000;
		for(int i = 0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			sum += a;
			list[a+4000]++;
			
			if(max < a) {
				max = a;
			}
			if(min > a) {
				min = a;
			}
		}
		
		int count  = 0; // �߾Ӱ��� �󵵼�
		int mode_max = 0; // �ֺ��� �ִ�
		
		//������ ������ �ֺ��� 1���� �����ϸ� true, �ƴϸ� false
		boolean test = false;
		
		for(int i = min+4000;i<max+4000;i++) {
			if(list[i]>0) {
				// �߾Ӱ� ã��
				//����Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�
				if(count<(n+1)/2) {
					count+= list[i]; // i���� �󵵼��� count�� ����
					median = i-4000;
				}
				// �ֺ� ã��
				//���� �ֺ󰪺��� ���� ���� �󵵼��� ���ٸ�
				if(mode_max < list[i]) {
					mode_max = list[i];
					mode = i-4000;
					test = true; // ù �����̹Ƿ� true
				//���� �ֺ� �ִ񰪰� ������ ����̸鼭 �ѹ��� �ߺ��Ǵ� ���
				}else if(mode_max == list[i] && test == true) {
					mode = i - 4000;
					test = false;
				}
			}
		}
		System.out.println(Math.round(sum/n)); // n���� ������ ���� n���� ���� ��
		System.out.println(median); // �߾Ӱ�
		System.out.println(mode); // �ֺ�
		System.out.println(max-min); // max-min
	}

}
