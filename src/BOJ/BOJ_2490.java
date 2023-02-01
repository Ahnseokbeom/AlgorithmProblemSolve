package BOJ;

import java.util.Scanner;

public class BOJ_2490 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			int sum = 0;
			for(int j = 0;j<4;j++) {
				int n = sc.nextInt();
				if(n == 0) sum++;
			}
			if(sum==0) System.out.println("E");
			if(sum==1) System.out.println("A");
			if(sum==2) System.out.println("B");
			if(sum==3) System.out.println("C");
			if(sum==4) System.out.println("D");
		}
		sc.close();
	}
}
