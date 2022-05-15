package algorigsm;

import java.util.ArrayList;

public class BOJ_11723 {
	static ArrayList<Integer> S;
	public void add(int x) {
		if(!S.contains(x)) {
			S.add(x);
		}
	}
	public void remove(int x) {
		if(!S.contains(x)) {

		}
	}
	public static void main(String[] args) {
		S.add(1);
		System.out.println(S.toString());
	}

}
