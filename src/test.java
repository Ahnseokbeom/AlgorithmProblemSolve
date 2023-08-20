import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String s = "abcde";
		String[] str = s.split("");
		int[][] arr = {{1,3},{1,4},{4,5}};
		swap(str,arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(String[] str, int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			int a = arr[i][0]-1;
			int b = arr[i][1]-1;
			System.out.println((b-a+1)/2);
			for(int j = 0;j<(b-a+1)/2;j++) {
				String temp = str[a-j];
				str[a-j] = str[b-j];
				str[b-j] = temp;
			}
		}
	}

}
