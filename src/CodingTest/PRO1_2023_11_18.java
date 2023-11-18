package CodingTest;

public class PRO1_2023_11_18 {
	public static void main(String[] args) {
		System.out.println(solution(4,3,new int[][] {{1,2,2,2},{1,2,1,1},{1,2,2,1},{3,2,1,1}}));
		System.out.println(solution(3, 2, new int[][] {{1,1,1},{1,2,2},{1,2,4}}));
		System.out.println(solution(2, 4, new int[][] {{1,2},{3,4}}));
		System.out.println(solution(3, 2, new int[][] {{1,2,3},{1,2,1},{1,3,1}}));
		System.out.println(solution(3, 1, new int[][] {{1,1,1},{2,2,2},{3,3,3}}));
	}
	public static int solution(int n, int k, int[][] grid) {
        int[][] dp = calDp(grid);
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int x = i; x <= n; x++) {
                    for (int y = j; y <= n; y++) {
                        int area = calArea(dp, i, j, x, y);
                        if (area <= k) {
                            answer = Math.max(answer, (x - i + 1) * (y - j + 1));
                        }
                    }
                }
            }
        }

        return answer*answer;
    }

    private static int[][] calDp(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }

        return dp;
    }

    private static int calArea(int[][] dp, int i, int j, int x, int y) {
        return dp[x][y] - dp[x][j - 1] - dp[i - 1][y] + dp[i - 1][j - 1];
    }
}
