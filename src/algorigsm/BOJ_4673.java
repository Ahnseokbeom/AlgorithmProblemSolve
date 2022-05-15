package algorigsm;

public class BOJ_4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i = 1;i<10001;i++) { // n���ٰ� 1���� 10000���� �Է����ش�.
			int n = self(i);
			
			if(n < 10001) { // �� �� 10001 ��, 10000���� �۴ٸ� true�� �ٲ��ش�
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<10001;i++) {
			if(!check[i]) { // false�� ��츸 ����Ѵ�(�����ѹ�)
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
	public static int self(int n) { // self�ѹ� �Լ�
		int sum = n;
		
		while(n!=0) { // n�� 0�� �ƴϸ� �� �ڸ�����ŭ �����ش�.
			sum = sum + (n%10); // 1��°�� 1���ڸ� , 2��°�� 2���ڸ�...������ �ڸ����� ������
			n = n/10;
		}
		return sum; 
	}

}
