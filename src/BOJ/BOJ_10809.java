package BOJ;

import java.util.Scanner;

public class BOJ_10809 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String s = sc.next();
				
		for(char c = 'a';c<='z';c++) { // char c = a~z����
			System.out.print(s.indexOf(c)+" "); // String ���� ������ �� �ε��� ��ȣ ���
		}
		sc.close();
	}

}
