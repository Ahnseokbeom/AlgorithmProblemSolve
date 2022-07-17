package programmers;

public class PRO_2_MaxMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String answer = "";
		String[] str = s.split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<str.length;i++) {
			if(Integer.parseInt(str[i])>max) {
				max = Integer.parseInt(str[i]);
			}
			if(Integer.parseInt(str[i])<min) {
				min = Integer.parseInt(str[i]);
			}
		}
		answer = min+" "+max;
		System.out.println(answer);

	}

}
