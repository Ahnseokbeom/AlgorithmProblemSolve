package CodeUp;

import java.text.DecimalFormat;
import java.util.Stack;

public class PRO_2016 {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		int num = 12421421;
		System.out.println(Format(num));
	}
	public static String Format(int num) {
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(num);
	}

}
