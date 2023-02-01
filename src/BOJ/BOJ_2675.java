package BOJ;

import java.util.Scanner;

public class BOJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // �׽�Ʈ���̽� ����
		
			for(int i = 0;i<t;i++) { // �׽�Ʈ���̽���ŭ �ݺ�
				int r = sc.nextInt(); // ���� �ݺ� Ƚ�� �Է�
				String str = sc.next(); // ���ڿ� �Է�
				for(int j = 0;j<str.length();j++) { // ���ڿ� ���̸�ŭ �ݺ�
					for(int k = 0;k<r;k++) { // ���� �ݺ� Ƚ����ŭ �ݺ�
						System.out.print(str.charAt(j)); // ���� ���
					}
			}
			System.out.println(); // �ٹٲ�
		}	
		sc.close();	
	}

}
