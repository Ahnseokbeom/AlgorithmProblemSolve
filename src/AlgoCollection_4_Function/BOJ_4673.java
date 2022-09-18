package AlgoCollection_4_Function;

public class BOJ_4673 {
	public static void main(String[] args) {
		self(10);
	}
	public static int self(int n) {
		System.out.println(n);
		return self(n);
	}

}
