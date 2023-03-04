package SWMaestro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class bruteForce {
	public static void main(String[] args) {
		int[] test1 = new int[3];
		test1(test1,0,0,3,10);

		ArrayList<Integer> arr = new ArrayList<>();
		String Stest2 = "";
		boolean[] visit = new boolean[7];
		for(int i = 1;i<=2;i++) {
			test2(arr,visit,"17",Stest2,i);
		}
		int test2Answer = 0;
		for(int i : arr) if(isPrime(i)) test2Answer++;
		System.out.println(test2Answer);

		arr.clear();
		Arrays.fill(visit, false);
		for(int i = 1;i<=3;i++) {
			test2(arr,visit,"110",Stest2,i);
		}
		test2Answer = 0;
		for(int i : arr) if(isPrime(i)) test2Answer++;
		System.out.println(test2Answer);

		String[] Stest3 = {"A","B","C","D"};
//		test3(Stest3,0,Stest3.length-1);
		int[] Itest3 = {1,2,3,4};
		test3(Itest3,0,Itest3.length-1);

		int[] SetTest3 = {1,2,3};
		HashSet<int[]> set = new HashSet<>();
		for(int i = 0;i<SetTest3.length;i++) {
			set.add(new int[] {1,2,3});
		}

	}
	public static void test1(int[] arr, int cur, int cnt,int n,int limit) {
		if(cnt==n) {
				for(int i : arr) {
					System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i = cur+1;i<=limit;i++) {
			arr[cnt] = i;
			test1(arr,cur,cnt+1,n,limit);
		}
	}

	public static void test2(ArrayList<Integer> arr,boolean[] visit,String numbers, String temp, int num) {
		if(temp.length()==num) {
			int number = Integer.parseInt(temp);
			if(!arr.contains(number)) arr.add(number);
			return;
		}else {
			for(int i = 0;i<numbers.length();i++){
				if(!visit[i]) {
					visit[i] = true;
					temp+=numbers.charAt(i);
					test2(arr,visit,numbers,temp,num);
					visit[i] = false;
					temp = temp.substring(0,temp.length()-1);
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
		for(int i = 2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	public static void test3(String[] arr, int left, int right) {
		if(left==right) {
			for(String i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else {
			for(int i = left;i<=right;i++) {
				test3Swap(arr,left,i);
				test3(arr,left+1,right);
				test3Swap(arr,left,i);
			}
		}
	}
	public static void test3Swap(String[] arr, int a, int b) {
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void test3(int[] arr, int left, int right) {
		if(left==right) {
			for(int i : arr) System.out.print(i+" ");
			System.out.println();
		}else {
			for(int i = left;i<=right;i++) {
				test3Swap(arr,left,i);
				test3(arr,left+1,right);
				test3Swap(arr,left,i);
			}
		}
	}
	public static void test3Swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void setTest3(HashSet<int[]> set, int left, int right) {
		if(left==right) {
			System.out.println(set);
		}else {
			for(int i = left;i<=right;i++) {
				setTest3(set,left,i);

			}
		}
	}

}
