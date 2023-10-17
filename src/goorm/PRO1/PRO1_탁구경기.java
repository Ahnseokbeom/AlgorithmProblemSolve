package goorm.PRO1;

public class PRO1_탁구경기 {
	static StringBuilder sb;
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"D","P","P","D","D"}));
		System.out.println(solution(new String[] {"D","P","P","D","D","P","P","P","D","D"}));
	}
	public static StringBuilder solution(String[] arr) {
		sb = new StringBuilder();
		int Dnum = 0;
		int Pnum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].equals("D")) Dnum++;
			else Pnum++;
			if(Math.abs(Dnum-Pnum)==2) break;
		}
		sb.append(Dnum).append(":").append(Pnum);
		return sb;
	}
}
