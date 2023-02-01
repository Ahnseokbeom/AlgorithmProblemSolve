package BOJ;

import java.util.Scanner;

public class BOJ_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[sc.nextInt()];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.next();
		}
		for(int i = 0;i<arr.length;i++) {
			int cnt = 0; // ���� ��
			int sum = 0; // ����
			for(int j  = 0;j<arr[i].length();j++) { // �迭�� �ε��� ���� ���� �ϳ��� ��
				if(arr[i].charAt(j)=='O') {
					cnt+=1; // O�� ������ ����
				}else { // X�� ������ 0���� �ʱ�ȭ
					cnt = 0;
				}
				sum+=cnt; // ������ ���տ� ���� ����
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
