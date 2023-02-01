package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2747 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int n1 = 0;
		int n2 = 0;
		int temp1 = 0;
		int temp2 = 0;
		
		for(int i = 0;i<n;i++) {
			if(i==0 || i==1) {
				n1 = n2; n2 = 1;
			}else {
				temp1 = n1;
				temp2 = n2;
				n1 = temp2;
				n2 = temp1+temp2;
			}
		}
		System.out.println(n2);
		
	}

}
