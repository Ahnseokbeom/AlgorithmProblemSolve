package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_3040 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		ArrayList<Integer> arr =new ArrayList<>();
		for(int i = 0;i<9;i++) {
			int n = Integer.parseInt(br.readLine());
			arr.add(n);
			sum+=n;
		}
		for(int i = 0;i<arr.size();i++) {
			for(int j = i+1;j<arr.size();j++) {
				if(sum-(arr.get(j)+arr.get(i))==100) {
					arr.remove(i);
					arr.remove(j-1);
					break;
				}
			}
		}
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
