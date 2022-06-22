package AlgoCollection_5_String;

import java.util.Scanner;

public class BOJ_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			sum++;
			if((s.charAt(i)-65)+65>=65 && (s.charAt(i)-65)+65<=67) {
				sum += 2;
			}else if((s.charAt(i)-65)+65>=68 && (s.charAt(i)-65)+65<=70){
				sum+=3;
			}else if((s.charAt(i)-65)+65>=71 && (s.charAt(i)-65)+65<=73) {
				sum+=4;
			}else if((s.charAt(i)-65)+65>=74 && (s.charAt(i)-65)+65<=76) {
				sum+=5;
			}else if((s.charAt(i)-65)+65>=77 && (s.charAt(i)-65)+65<=79) {
				sum+=6;
			}else if((s.charAt(i)-65)+65>=80 && (s.charAt(i)-65)+65<=83) {
				sum+=7;
			}else if((s.charAt(i)-65)+65>=84 && (s.charAt(i)-65)+65<=86) {
				sum+=8;
			}else {
				sum+=9;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
