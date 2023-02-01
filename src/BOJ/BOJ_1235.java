package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_1235 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      HashSet<String> set = new HashSet<>();

	      String[] str = new String[n];
	      for(int i=0;i<n;i++) str[i] = br.readLine();

	      for(int k=1;k<=str[0].length();k++){
	         for(int i=0;i<n;i++){
	            set.add(str[i].substring(str[0].length()-k));
	         }
	         if(set.size()==n){
	            System.out.println(k);
	            return;
	         }
	         set.clear();
	      }
	   }

}
