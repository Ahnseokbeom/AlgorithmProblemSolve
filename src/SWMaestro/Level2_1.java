package SWMaestro;

import java.util.ArrayList;
import java.util.Arrays;

public class Level2_1 {
	// <- (-1,1) -> (1,1) <-->(0,2)
	public static int[][] solution(String s) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			boolean check = false;
			if(s.charAt(i)=='-') count++;
			if(s.charAt(i)=='>') {
				list.add(1);
				list.add(count);
				count = 0;
			}
			if(s.charAt(i)=='<') {
				for(int j = i+1;j<s.length();j++) {
					if(s.charAt(j)=='-') count++;
					if(s.charAt(j)=='>') {
						check = true;
						i = j;
						break;
					}
					if(s.charAt(j)=='<') {
						check = false;
						i = j-1;
						break;
					}
				}
				if(check) {
					list.add(0);
					list.add(count);
					count = 0;
				}
				if(!check) {
					list.add(-1);
					list.add(count);
					count = 0;
				}
			}
		}
		int[][] answer = new int[list.size()/2][2];
		int j = 0;
		int k = 1;
		for(int i = 0;i<answer.length;i++) {
			answer[i][0] = list.get(j);
			answer[i][1] = list.get(k);
			j+=2;
			k+=2;
		}
		return answer;
	}
	public static void main(String[] args) {
		String s1 = "->--><---><--<-";
		String s2 = "->-><-<--<";
		System.out.println(Arrays.deepToString(solution(s1)));
		System.out.println(Arrays.deepToString(solution(s2)));
	}

}
