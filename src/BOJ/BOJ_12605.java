package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_12605 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<t;i++) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			System.out.print("Case #"+(i+1)+": ");
			for(int j = arr.length-1;j>=0;j--) {	
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	
	}

}
