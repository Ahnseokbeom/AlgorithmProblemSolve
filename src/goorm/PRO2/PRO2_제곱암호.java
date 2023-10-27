package goorm.PRO2;

public class PRO2_제곱암호 {
	static StringBuilder sb;
	public static void main(String[] args) {
		System.out.println(solution(6, "z2y2z1"));
		System.out.println(solution(8, "a1b2c3e4"));
	}
	public static String solution(int n, String s) {
		sb = new StringBuilder();
		for(int i = 0;i<n;i+=2){
			int num = s.charAt(i)+(int)Math.pow(s.charAt(i+1)-'0',2);
			if(num > 122){
				sb.append((char)((num-123)+'a'));
			}else sb.append((char)num);
		}
		return sb.toString();
	}
}
