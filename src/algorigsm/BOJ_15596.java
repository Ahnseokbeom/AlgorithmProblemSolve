package algorigsm;

//배열의 합을 구해주는 함수
public class BOJ_15596 {
	public static void main(String[] args) {
		class Test{
			long sum(int[] a) {
				long sum = 0;
				
				for(int i = 0;i<a.length;i++) {
					sum += a[i];
				}
				return sum;
			}
		}
	}
	
}
