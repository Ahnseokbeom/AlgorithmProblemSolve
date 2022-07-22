package programmers;

public class PRO_1_NewID {
	public static void main(String[] args) {
		// - (45) / . (46) / _ (95) / 97~122
		String new_id = "...!@BaT#*..y.abcdefghijklm";
//		String new_id = "=.=";
		String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.0-9a-z]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if(answer.length()==0) answer = "a";
        if(answer.length()>=16) answer = answer.substring(0,15);
        if(answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0,answer.length()-1);
        }
        if(answer.length()<=2){
        	 while(answer.length()<3){
                 answer += answer.charAt(answer.length()-1);
             }
        }
        System.out.println(answer);

	}

}
