package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//{"Enter uid1234 Muzi","Enter uid4567 Prodo",
//"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}
//������ ���� - id�� �̾Ƴ��� ���� ����������, �� �ڿ� ġȯ�ϴ� �������� ������
public class PRO_openchat {
	class Solution {
	    public String[] solution(String[] record) {
	    	ArrayList<String> list = new ArrayList<String>();
	    	Map<String, String> name = new HashMap<>();
	    	for(int i = 0;i<record.length;i++) { // arr�迭�� ���� �������� ���� 
	    		String[] arr = record[i].split(" ");
	    		if(arr[0].equals("Enter")) { // 0��° �ε����� enter�̸�(����)
	    			name.put(arr[1], arr[2]); // id�� username�� map�� �ִ´�.
	    			list.add(arr[1]+"���� ���Խ��ϴ�."); // list�� id�� ���� ��� �߰�
	    		}else if(arr[0].equals("Leave")) { // 0��° �ε����� leave�̸�(����)
	    			list.add(arr[1]+"���� �������ϴ�."); // list�� id�� �ְ� ��� �߰�
	    		}else if(arr[0].equals("Change")) { // 0��° �ε����� change�̸�(�ٲ�)
	    			name.replace(arr[1], arr[2]); // id�� username�� ���� �ٲ��ش�.
	    		}
	    	}
	    	String[] answer = new String[list.size()];
	    	for(int i = 0;i<answer.length;i++) {
	    		int idx = list.get(i).indexOf("��"); // (uid???? - 0~6�����̹Ƿ�) 7 �̾Ƴ�
	    		String str = list.get(i).substring(0,idx); // 0~6���� ����(~~���� ���Խ��ϴ�. ~~ ����)
	    		answer[i] = name.get(str)+list.get(i).substring(idx);
	    		//name.get(str)�̶� name.get - hashmap���� ���� id(Ű��)�� username�� ����
	    		//�׷��� name.get(str)�� �ϸ� id(Ű��)�� ������ ������ username���� �ٲ��.
	    		//substring�̶� - substring(1,2) - 1�� ����,2�� �� / substring(1) 1�� �����̹Ƿ� 1���� ������
	    		//��, substring(idx) = "��"���� ������ ������ش�.
	    	}
	        
	        return answer;
	    }
	}

}
