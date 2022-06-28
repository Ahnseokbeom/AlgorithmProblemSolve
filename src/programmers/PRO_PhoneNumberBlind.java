package programmers;

public class PRO_PhoneNumberBlind {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String phone = "01033334444";
		String s = "";
		for(int i = 0;i<phone.length();i++) {
			if(i>=phone.length()-4) {
				s+=phone.charAt(i);
			}else {
				s+="*";
			}
		}
		System.out.println(s);
		s = phone.replaceAll(phone.substring(0, phone.length()-4), "*");
		System.out.println(s);
	}

}
