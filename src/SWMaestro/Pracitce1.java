package SWMaestro;

import java.util.Arrays;

public class Pracitce1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int n = 5;
		for(int i = 1;i<=5;i++) {
			arr[i-1] = 5-i;
		}
		System.out.println(Arrays.toString(arr));
		selectSort(arr,n);
		System.out.println(Arrays.toString(arr));
		System.out.println(fact(3));
		System.out.println(recursive(2,10));
		int recurs = (int)Math.pow(2,3);
		System.out.println(recurs);

		int answer = 0;
		int[] nums = {1,2,3,4};
		for(int i = 0;i<nums.length-2;i++) {
			int num = 0;
			for(int j = i+1;j<nums.length-1;j++) {
				for(int k = j+1;k<nums.length;k++) {
					num = nums[i]+nums[j]+nums[k];
					if(hi(num)) answer++;
					System.out.printf("num : %d+%d+%d = %d",i,j,k,num);
				}
			}
		}
		System.out.println(answer);

	}
	private static void selectSort(int[] arr, int n) {
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j] < arr[min]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	private static int fact(int n) {
		if(n<=1) return 1;
		return n*fact(n-1);
	}
	private static int recursive(int x, int n) {
		if(n==0) return 1;
		if(n==1) return x;
		return x * recursive(x,n-1);
	}
	public static boolean hi(int n) {
		int count = 0;
		for(int i = 1;i<=n;i++) {
			if(n%i==0) count++;
		}
		if(count==2) return true;
		return false;
	}
}

