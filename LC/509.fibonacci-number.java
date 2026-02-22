/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        int[] dp=new int[3];
        dp[1]=1;

        for(int i=2; i<=n; i++)
        {
            dp[2]=dp[0]+dp[1];
            dp[0]=dp[1];
            dp[1]=dp[2];
        }

        return dp[2];

    }
}
// @lc code=end

