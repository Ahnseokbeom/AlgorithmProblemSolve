package Algo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	static void bubbleSort(String[] a) {
		for(int i = a.length-1;i>=1;i--) {
			boolean check = true;
			for(int  j =0;j<i;j++) {
				if(a[j].compareTo(a[j+1]) > 0) {
					swap(a,j,j+1);
					check = false;
				}
			}
			if(check) break;
		}
	}
	static void swap(String[] a , int i,int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
