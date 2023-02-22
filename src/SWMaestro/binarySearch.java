package SWMaestro;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
	static int[] arr = {2,4,8,11,18,13,21,24,30,33,37,25,22,70};

	static int num = 4;
	static int[] nums = {100,200,500,800};

	static int x = 10;
	static int y = 8;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 18;
		Arrays.sort(arr);
		System.out.println(Search(n,0,arr.length-1));

		System.out.println(solve(0,0,0));
		System.out.println(Game(99000,0));
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
}
