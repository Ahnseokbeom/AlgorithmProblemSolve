package BOJ;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ_9663 {
	static int n; // ü������ ũ��
	static int[] list; // ü����
	static int count = 0; // ����� ��
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new int[n];
		NQeen(0); // 0��° �ε�������(��)���� ����
		System.out.println(count);
		
	}
	public static void NQeen(int x) {// index = �� / value = ��
		//���� �� ä��� ����� �� 1����
		if(x == n) {
			count++;
			return;
		}else {
			for(int i = 0;i<n;i++) { // �ش� ������ i��° �࿡ ���� ���� �� �ִ��� �˻�
				list[x] = i;
				if(check(x)) {
					NQeen(x+1);
				}
			}
		}
	}
	public static boolean check(int y) { // ���� ������ �ִ��� üũ�ϴ� �Լ�
		for(int i = 0;i<y;i++) { // �ش� ���� ��� ���� ��ġ�ϴ� ���(false)
			if(list[y]==list[i]) {
				return false;
			//�밢���� x��ǥ-y��ǥ�� ���밪�� list[x]-list[y]���밪�� ������ false
			}else if(Math.abs(y-i) == Math.abs(list[y]-list[i])) {
				return false;
			}
		}
		return true;
	}

}
