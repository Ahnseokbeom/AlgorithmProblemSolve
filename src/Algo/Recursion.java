package Algo;

public class Recursion {
	public static void main(String[] args) {
		// factorial
		System.out.println("factorial");
		for(int i = 3;i<=10;i++) {
			System.out.printf("%d %d\n",i,factorial(i));
		}
		System.out.println();
		// print
		System.out.println("print");
		int[] a= {1,2,3,4,5,6,7,8,9};
		print(a,0);

		// sum
		System.out.printf("sum");
		for(int i = 3;i<=10;i++) {
			System.out.printf("%d %d\n",i,sum(i));
		}
	}
	static int factorial(int n) {
		if(n <=1) return 1;
		return n * factorial(n-1);
	}
	static void print(int[] a, int index) {
		if(index >= a.length) return;
		System.out.printf("%d", a[index]);
		print(a, index+1);
	}
	static int sum(int n) {
		if(n < 2) return 1;
		return n+sum(n-1);
	}
}
