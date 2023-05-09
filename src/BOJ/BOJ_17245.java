package BOJ;

public class BOJ_17245 {
	public static void main(String[] args){
		int n = 5;
		int[][] arr = {{1,4,0,2,1},{0,0,5,6,3},{8,4,7,2,0},{7,1,0,5,3},{4,5,7,9,1}};
		System.out.println(solution(n, arr));
	}
	public static long solution(int n, int[][] arr) {
		long left = 0;
		long right = 0;
		long sum = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				sum+=arr[i][j];
				if(arr[i][j] > right) right = arr[i][j];
			}
		}
		while(left+1 < right) {
			long mid = (left+right)/2;
			long count = 0;
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					count += mid > arr[i][j] ? arr[i][j]:mid;
				}
			}
			if((double) count / sum >=0.5) right = mid;
			else left = mid;
		}
		return right;
	}


}
