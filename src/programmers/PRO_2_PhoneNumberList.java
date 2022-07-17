package programmers;

import java.util.ArrayList;

public class PRO_2_PhoneNumberList {
	public static void main(String[] args) {
		String[] str = {"123","456","789"};
		String[]s = {"12","123","1235","567","88"};
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0;i<str.length;i++) {
			arr.add(str[i]);
		}
		boolean check = true;
		for(int i = 0;i<arr.size();i++) {
			for(int j = i+1;j<arr.size();j++) {
				System.out.println(arr.get(j).contains(str[i]));
				if(arr.get(j).contains(arr.get(i))) check = false;
			}
		}
		System.out.println(check);
	}

}
