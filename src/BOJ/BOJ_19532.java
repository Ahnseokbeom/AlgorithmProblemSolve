package BOJ;

import java.io.IOException;

public class BOJ_19532 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		System.out.println(solution(1, 3, -1, 4, 1, 7));
		sb.delete(0, sb.length());
		System.out.println(solution(2, 5, 8, 3, -4, -11));
	}
	public static StringBuilder solution(int a, int b, int c, int d, int e, int f) {
		for(int i =-999;i<1000;i++) {
			for(int j =-999;j<1000;j++) {
				if((a*i+b*j==c) &&(d*i+e*j==f)) {
					sb.append(i).append(" ");
					sb.append(j);
					break;
				}
			}
		}
		return sb;
	}

}
