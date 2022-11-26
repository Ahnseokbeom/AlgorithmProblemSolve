package Algo;

import java.util.Arrays;

public class StringSelectionSort {
	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int findMin(String[] a, int start) {
		String minValue = a[start];
		int minIndex = start;
		for (int i = start + 1; i < a.length; ++i) {
			if (a[i].compareTo(minValue) < 0) {
				minValue = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	static void selectionSort(String[] a) {
		for(int i = 0;i<a.length-1;i++) {
			int min = findMin(a,i);
			swap(a,i,min);
		}
	}
}
