package Softeer.PRO3;

public class PRO3_수퍼바이러스 {
	private static final long mod = 1000000007;
    public static void main(String[] args) {
       System.out.println(solution(1,2,10));
    }
    public static long solution(long k, long p, long n) {
    	long answer = divideAndConquer(p, n) * k;
    	return answer % mod;
    }
    public static long divideAndConquer(long p, long n){
	    if(n==1)  return p;
	    long answer = divideAndConquer(p,n/2);
	    if(n%2==0){
	      return (answer*answer)%mod;
	    }else{
	      answer *= answer;
	      answer %= mod;
	      return (answer*p)%mod;
	    }
    }
}
