package CodingTest;

public class PRO1 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {1,2,7,6,4}));
	}
	public static int solution(int[] nums) {
        int answer = 0;
        for(int i = 0;i<nums.length-2;i++){
            int num = 0;
            for(int j = i+1;j<nums.length-1;j++){
                for(int k = j+1;k<nums.length;k++){
                    num = nums[i]+nums[j]+nums[k];
                    if(prime(num)) answer++;
                }
            }
        }
        return answer;
    }
    private static boolean prime(int n){
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2) return true;
        return false;
    }
}