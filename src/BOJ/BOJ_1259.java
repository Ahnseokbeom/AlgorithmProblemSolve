package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		while(true) {
			String n = br.readLine();
			if(n.equals("0")) break;
			String[] arr = new String[n.length()];
			String[] arr2 = new String[n.length()];
			
			for(int i = 0;i<arr.length;i++) {
				arr[i] = n.substring(i,i+1);
			}
			for(int i = 0;i<arr2.length;i++) {
				arr2[i] = arr[arr.length-1-i];
			}
			int count = 0;
			for(int i = 0;i<n.length();i++) {
				if(arr[i].equals(arr2[i])) count++;
			}
			if(count==n.length()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
