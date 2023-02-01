package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list1 = br.readLine().split(" ");
		String[] list2 = br.readLine().split(" ");
		String[] list3 = br.readLine().split(" ");
		String x = null;
		String y = null;


		if(list1[0].equals(list2[0])) {
			x = list3[0];
		}else if(list1[0].equals(list3[0])) {
			x = list2[0];
		}else x = list1[0];

		if(list1[1].equals(list2[1])) {
			y = list3[1];
		}else if(list1[1].equals(list3[1])) {
			y = list2[1];
		}else y = list1[1];
		System.out.println(x+" "+y);

	}

}
