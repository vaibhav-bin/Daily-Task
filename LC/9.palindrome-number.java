/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        long rev=0;
        int num=x;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        return rev==num;
    }
}
// @lc code=end

