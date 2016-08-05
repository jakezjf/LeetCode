/**
*Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
Example:
Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
*
*
*/
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int ans=1;
        int tmp=9;
        for(int i=1;i<=n&&i<10;i++){
            ans+=tmp;
            tmp*=(10-i);
        }
        return ans;
    }
}
