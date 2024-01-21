package goorm.PRO1;

public class PRO1_47882 {
	static StringBuilder sb;
	static Character[] arr = {'1','I','l','|'};
	public static void main(String[] args) {
		System.out.println(solution("We wi1l we wi|I rock you!"));
		System.out.println(solution("xl30gjdhaI1gdfkl|dlh;(rn4ky1kgndlIIldfl|ld|dBjfHd"));
		System.out.println(solution("~]I=-f{UX5%X<]`kQl8?O^UDflq=2`;1LM7a/74([|8qAO<.CJY>i_'\\n*A-q(QWFgBL+}RU(ZITZL:\\0?FWb1+bUeP0/Y%\"1IB\\"));
	}
	public static String solution(String s) {
		sb = new StringBuilder();
		long cnt1 = s.chars()
				.mapToObj(ch -> (char) ch)
				.filter(ch -> ch=='1').count();
		long cntI = s.chars()
				.mapToObj(ch -> (char) ch)
				.filter(ch -> ch=='I').count();
		long cntl = s.chars()
				.mapToObj(ch -> (char) ch)
				.filter(ch -> ch=='l').count();
		long cnt = s.chars()
				.mapToObj(ch -> (char) ch)
				.filter(ch -> ch=='|').count();
		sb.append(cnt1).append("\n").append(cntI).append("\n").append(cntl).append("\n").append(cnt);
		return sb.toString();
	}
}
