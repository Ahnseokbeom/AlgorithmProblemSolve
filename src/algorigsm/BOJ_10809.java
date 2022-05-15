package algorigsm;

import java.util.Scanner;

public class BOJ_10809 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String s = sc.next();
				
		for(char c = 'a';c<='z';c++) { // char c = a~z까지
			System.out.print(s.indexOf(c)+" "); // String 안의 있으면 그 인덱스 번호 출력
		}
		sc.close();
	}

}
