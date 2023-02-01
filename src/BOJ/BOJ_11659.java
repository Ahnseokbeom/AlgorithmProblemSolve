package BOJ;

import java.util.Scanner;

// ���� �� ���ϱ� -- �ð��ʰ�(����)
public class BOJ_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // �迭 ũ�� �Է�
		int m = sc.nextInt(); // �ݺ� Ƚ�� �Է�
		int[] arr = new int[n]; // �迭 �ʱ�ȭ
		
		for(int a = 0;a<n;a++) { // �迭�� �� �ε����� �� �Է�
			arr[a] = sc.nextInt();
		}
		for(int b = 0;b<m;b++) { // �ݺ��� ���� �Է�
			int sum = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			for(int c = i-1;c<j;c++) { // �ݺ��Ǵ� ������ �������� �����ش�
				sum+=arr[c];
			}
			System.out.println(sum); // �� ���
		}
		sc.close();
	}

}
