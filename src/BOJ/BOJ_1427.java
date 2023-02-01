package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while(n!=0){
			int a = n%10;
			n /=10;
			i++;
			list.add(a);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}

}
