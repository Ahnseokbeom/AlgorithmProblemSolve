package CodingTest;

import java.util.ArrayList;
import java.util.List;

public class PRO2_2023_11_04 {
	static String[] arr1 = {"A","A","B","C","D"};
	static String[] arr2 = {"B","C","B","D"};
	public static void main(String[] args) {
        List<String> listX = new ArrayList<>();
        List<String> listY = new ArrayList<>();
        dic(arr1, 0, "", listX);
        dic(arr2, 0, "", listY);
        System.out.println(solution(listX, listY));
	}
   public static void dic(String[] arr, int index, String current, List<String> list) {
        if (index == arr.length) {
            list.add(current);
            return;
        }
        dic(arr, index + 1, current + arr[index], list);
        dic(arr, index + 1, current, list);
    }
   public static int solution(List<String> listX, List<String> listY) {
	   int answer = 0;
       for(int i = 0;i<listX.size();i++) {
       	if(listY.contains(listX.get(i))) {
       		answer = Math.max(answer, listX.get(i).length());
       	}
       }
       return answer+1;
   }
}
