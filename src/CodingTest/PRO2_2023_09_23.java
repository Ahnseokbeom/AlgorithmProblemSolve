package CodingTest;

import java.util.ArrayList;

public class PRO2_2023_09_23 {
	static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
		String s1 = "centerminus";
		String[] str1 = {"cent","center","term","terminus","rm","min","minus","us"};
		String s2 = "aaaababab";
		String[] str2 = {"aaa","aaaa","ab","bab","aababa"};
		int j = 0;
		for(int i = 0;i<str2.length;i++) {
			String s = s2;
			String check = "";
			for(;j<str2.length;j++) {
				if(s.length() < str2[j].length()) continue;
				if(s.substring(0,str2[j].length()).equals(str2[j])) {
					s = s.replaceAll(str2[j], "");
					s = str1[j].charAt(str2[j].length()-1)+s;
					System.out.println(s);
					check+=String.valueOf(j);
				}
			}
			if(!list.contains(check)) {
				list.add(check);
				i--;
				j = i+1;
			}
			else {
				j = 0;
			}
		}
		System.out.println(list);


	}
	public static int solution(String s,String[] str) {
		int answer = 0;
		return answer;
	}
}
