package BOJ;

import java.util.Scanner;
//���丮���� 0���� ���ϱ�
public class BOJ_1676{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		while(n >=5) {
			cnt += n/5;
			n /=5;
		}
		
		System.out.println(cnt);
		sc.close();
	}

}