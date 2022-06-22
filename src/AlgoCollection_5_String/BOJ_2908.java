package AlgoCollection_5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int result1 = (a-((a/100)*100)-a%10)+((a%10*100)+a/100);
		int result2 = (b-((b/100)*100)-b%10)+((b%10*100)+b/100);
		if(result1>result2) {
			System.out.println(result1);
		}else {
			System.out.println(result2);
		}

	}

}
