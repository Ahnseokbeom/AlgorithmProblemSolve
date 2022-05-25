package algorigsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(max(a,b));
	}
	//	최대 공약수
	static int min(int a, int b) {
		while(b!=0){
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	//최소  공배수
	static int max(int a, int b) {
		return a*b / min(a,b);
	}
}
