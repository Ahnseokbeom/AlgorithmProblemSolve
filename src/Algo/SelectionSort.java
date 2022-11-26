package Algo;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {17,14,11,19,13,15,18,12,16,20};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int findMin(int[] arr, int start) {
		int minValue = arr[start];
		int minIndex = start;
		for(int i = start+1;i<arr.length;i++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	static void selectionSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int min = findMin(arr, i);
			swap(arr,i,min);
		}
	}
}
