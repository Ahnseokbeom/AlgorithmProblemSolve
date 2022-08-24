package programmers;

import java.util.HashMap;

public class PRO_1_MBTI {
	public static void main(String[] args) {
		// 1번 라이언형(R), 튜브형(T)
		// 2번 콘형(C), 프로도형(P)
		// 3번 제이지형(J), 무지형(M)
		// 4번 어피치형(A), 네오형(N)
		// 1~7 3,2,1,0,1,2,3
//		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		String[] survey = {"TR", "RT", "TR"};
//		int[] choices = {5, 3, 2, 7, 5};
		int[] choices = {7,1,3};
		char[] type = {'R','T','C','P','J','M','A','N'};
		String answer = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<type.length;i++) {
			map.put(type[i], 0);
		}
		for(int i = 0;i<choices.length;i++) {
			int p = 0;
			switch(choices[i]) {
			case 1: case 7: p=3; break;
			case 2: case 6: p=2; break;
			case 3: case 5: p=1; break;
			}
			if(choices[i]>4) map.put(survey[i].charAt(1), p);
			else map.put(survey[i].charAt(0), p);
		}
		System.out.println(map);
		for(int i = 0;i<type.length;i+=2) {
			if(map.get(type[i])<map.get(type[i+1])) {
				answer+=type[i+1];
			}else {
				answer+=type[i];
			}
		}
		System.out.println(answer);
	}

}
