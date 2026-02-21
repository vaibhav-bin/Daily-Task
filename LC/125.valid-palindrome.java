/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        boolean palin=true;
        s=s.toLowerCase();
        int L=s.length();
        int l=0, r=L-1;
        while(l<=r)
        {
            boolean left=Character.isLetterOrDigit(s.charAt(l));
            boolean right=Character.isLetterOrDigit(s.charAt(r));
            if(left&&right)
            {
                if(s.charAt(l)!=s.charAt(r))
                {
                    palin=false;
                    break;
                }
                l++; r--;
            }
            else if(left && !right)
            {
                r--;
            }
            else if(!left && right)
            {
                l++;
            }
            else
            {
                l++;
                r--;
            }
        }
        return palin;
    }
}
// @lc code=end

