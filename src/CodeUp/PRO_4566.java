package CodeUp;

public class PRO_4566 {
	static int sum = 0;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		prime(60,100);
		System.out.printf("%d\n%d",sum,min);
	}
	public static void prime(int x, int y) {
		if(x==1) x++;
		for(int i = x;i<=y;i++){
			boolean check = true;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					check = false;
					break;
				}
			}
			if(check) {
				sum+=i;
				min = Math.min(min, i);
			}
		}
	}
}
