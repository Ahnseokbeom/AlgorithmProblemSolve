package programmers;

public class PRO_3_Triangle {
	public int solution(int[][] triangle) {
        int answer = 0;
        int[][] result = new int[triangle.length][triangle[triangle.length-1].length];
        result[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
	        result[i][0] = result[i - 1][0] + triangle[i][0];
	        result[i][i] = result[i - 1][i - 1] + triangle[i][i];
	        for (int j = 1; j <= i-1; j++) {
		        result[i][j] = Math.max(result[i - 1][j - 1], result[i - 1][j]) + triangle[i][j];
		        answer = Math.max(answer, result[i][j]);
	        }
        }
        return answer;
    }
}
