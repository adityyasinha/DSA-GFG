class Solution {
    public int numberOfPath(int[][] mat, int k) {
        // code here
         int n = mat.length;
        int m = mat[0].length;

        int[][][] dp = new int[n][m][k + 1];

        if (mat[0][0] <= k)
            dp[0][0][mat[0][0]] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int coins = 0; coins <= k; coins++) {
                    if (i == 0 && j == 0) continue;

                    int val = mat[i][j];
                    if (coins >= val) {
                        int fromTop = (i > 0) ? dp[i - 1][j][coins - val] : 0;
                        int fromLeft = (j > 0) ? dp[i][j - 1][coins - val] : 0;
                        dp[i][j][coins] = fromTop + fromLeft;
                    }
                }
            }
        }

        return dp[n - 1][m - 1][k];
    }
}