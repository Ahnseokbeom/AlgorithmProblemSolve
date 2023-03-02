package SWMaestro;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
	static int[] arr = {2,4,8,11,18,13,21,24,30,33,37,25,22,70};

	static int num = 4;
	static int[] nums = {100,200,500,800};

	static int x = 10;
	static int y = 8;

	static int num1 = 5;
	static int[] num1Arr = {4,1,5,2,3};
	static int num2 = 5;
	static int[] num2Arr = {1,3,7,9,5};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 18;
		Arrays.sort(arr);
		System.out.println(Search(n,0,arr.length-1));

		System.out.println(solve(0,0,0));
		System.out.println(Game(99000,0));
		Arrays.sort(num1Arr);

		System.out.printf("\nBOJ_1920");
		for(int i = 0;i<num2Arr.length;i++) {
			if(Number(num2Arr[i])>=0) System.out.println(1);
			else System.out.println(0);

		}
		sc.close();
	}
	private static int Search(int n,int left,int right) {
		while(left<=right) {
			int mid = (left+right)/2;
			if(n==arr[mid]) return mid;
			else if(n<arr[mid]) right = mid-1;
			else left = mid+1;
		}
		return -1;
	}
	private static int solve(int idx, int count, int value) {
		if(count==3) return value;
		if(idx==num) return -1;
		int answer = 0;
		answer = Math.max(answer, solve(idx+1,count+1,value+nums[idx]));
		answer = Math.max(answer, solve(idx+1,count,value));

		return answer;
	}
	private static int Game(int x, int y) {
		int count = 0;
		int z = (int)((float)y/x*100);
		int zUp = z+1;
		if(z==100) return -1;
		while(z!=zUp) {
			x++;
			y++;
			count++;
			z = (int)((float)y/x*100);
		}
		return count;
	}
	private static int Number(int n) {
		int left = 0;
		int right = num1Arr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(n<num1Arr[mid]) {
				right = mid-1;
			}else if(n>num1Arr[mid]) {
				left = mid+1;
			}else return mid;
		}
		return -1;
	}
}
