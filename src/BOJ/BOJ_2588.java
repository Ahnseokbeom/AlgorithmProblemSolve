package BOJ;

import java.util.Scanner;

public class BOJ_2588 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.close();
		//-'0'�� ���� ���� : ���� String�� 385 ���� �ƽ�Ű�ڵ�� ����Ǿ��ֱ� ������ int���� ���� �˷��ֱ� ����
		System.out.println(a*(b.charAt(2)-'0'));
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a*Integer.parseInt(b));
	}

}
