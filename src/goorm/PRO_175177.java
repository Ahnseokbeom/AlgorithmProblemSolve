package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRO_175177 {
	static int[] arr = {40, 20, 10, 5, 1};
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(change(n));
	}
	public static int change(int n) {
		for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                answer += n / arr[i];
                break;
            } else {
                answer+= n / arr[i];
                n %= arr[i];
            }
        }
		return answer;
	}
}
