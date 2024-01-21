package goorm.PRO2;

public class PRO2_167853 {
	public static void main(String[] args) {
		solution(9);
	}
	public static void solution(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
