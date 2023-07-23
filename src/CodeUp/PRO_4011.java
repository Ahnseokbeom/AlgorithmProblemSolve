package CodeUp;

public class PRO_4011 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		System.out.println(solution("781201-1273845"));

		sb = new StringBuilder();
		System.out.println(solution("031205-3382012"));

		sb = new StringBuilder();
		System.out.println(solution("081123-2124567"));
	}
	public static StringBuilder solution(String s) {
		if(s.charAt(7)=='1' || s.charAt(7)=='2') {
			sb.append("19"+s.substring(0,2)+"/").append(s.substring(2,4)+"/").append(s.substring(4,6)+" ");
		}else {
			sb.append("20"+s.substring(0,2)+"/").append(s.substring(2,4)+"/").append(s.substring(4,6)+" ");
		}
		if(s.charAt(7)=='1' || s.charAt(7)=='3') sb.append("M");
		else sb.append("F");

		return sb;
	}
}
