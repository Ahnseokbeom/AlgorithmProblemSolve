package algorigsm;

public class BOJ_4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i = 1;i<10001;i++) { // n에다가 1부터 10000까지 입력해준다.
			int n = self(i);
			
			if(n < 10001) { // 이 때 10001 즉, 10000보다 작다면 true로 바꿔준다
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<10001;i++) {
			if(!check[i]) { // false인 경우만 출력한다(셀프넘버)
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
	public static int self(int n) { // self넘버 함수
		int sum = n;
		
		while(n!=0) { // n이 0이 아니면 각 자리수만큼 더해준다.
			sum = sum + (n%10); // 1번째는 1의자리 , 2번째는 2의자리...마지막 자리까지 더해줌
			n = n/10;
		}
		return sum; 
	}

}
