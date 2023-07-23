package CodeUp;

import java.util.Arrays;

public class PRO_4501 {
	public static void main(String[] args) {
		int[] arr = {79,57,88,72,95,88,64};
		Arrays.sort(arr);
		System.out.printf("%d\n%d",arr[arr.length-1],arr[arr.length-2]);
	}
}
