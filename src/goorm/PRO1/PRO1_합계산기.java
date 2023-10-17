package goorm.PRO1;

public class PRO1_합계산기 {
	static int answer;
	public static void main(String[] args){
		System.out.println(solution(3, new String[][] {{"1","+","3"},{"4","/","3"},{"3","-","2"}}));
		System.out.println(solution(3, new String[][] {{"3","-","4"},{"4","/","5"},{"5","*","1"}}));
	}
	public static int solution(int n, String[][] arr) {
		answer = 0;
		for(int i = 0;i<n;i++) {
			switch(arr[i][1]) {
			case "+" : answer += Integer.parseInt(arr[i][0])+Integer.parseInt(arr[i][2]); break;
			case "-" : answer += Integer.parseInt(arr[i][0])-Integer.parseInt(arr[i][2]); break;
			case "/" : answer += Integer.parseInt(arr[i][0])/Integer.parseInt(arr[i][2]); break;
			case "*" : answer += Integer.parseInt(arr[i][0])*Integer.parseInt(arr[i][2]); break;
			}
		}
		return answer;
	}
}
