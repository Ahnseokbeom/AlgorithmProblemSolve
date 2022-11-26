package Algo;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insertionSort(String[] arr) {
		for(int i = 1;i<arr.length;i++) {
			String value = arr[i];
			int j;
			for(j = i-1;j>=0;j--) {
				if(arr[j].compareTo(value) > 0)
					arr[j+1] = arr[j];
				else break;
			arr[j+1] = value;
			}
		}
	}
}
