class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for(int memo[]: dp){
            Arrays.fill(memo,-1);
        }

        return helper(word1, word2, word1.length(), word2.length(), dp);
    }

    public int helper(String w1,String w2,int i,int j,int[][] dp){
        if (i == 0) return j;
        if (j == 0) return i;

        if (dp[i][j] != -1) return dp[i][j];

        if (w1.charAt(i - 1) == w2.charAt(j - 1)) {
            dp[i][j] = helper(w1, w2, i - 1, j - 1, dp);
        } else {
            int insertOp = helper(w1, w2, i, j - 1, dp);
            int deleteOp = helper(w1, w2, i - 1, j, dp);
            int replaceOp = helper(w1, w2, i - 1, j - 1, dp);
            dp[i][j] = 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
        }

        return dp[i][j];
    }
}