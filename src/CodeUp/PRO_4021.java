package CodeUp;

public class PRO_4021 {
	public static void main(String[] args) {
		int[] arr = {12,39,40,51,75,87,92};
		int answer = 0;
		for(int i = 0;i<7;i++) {
			if(arr[i]%2==1) answer+=arr[i];
		}
		if(answer==0) System.out.println(-1);
		else System.out.println(answer);
	}

}
