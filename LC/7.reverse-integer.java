/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        long rev=0;
        int sign=x<0?-1:1;
        x=Math.abs(x);
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        rev*=sign;
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        return 0;
        return (int)rev;
    }
}
// @lc code=end

