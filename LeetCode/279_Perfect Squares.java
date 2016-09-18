/**
*Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
*
*For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
*四平方和定理(Lagrange's Four-Square Theorem)：所有自然数至多只要用四个数的平方和就可以表示。
*/

public class Solution {
    public int numSquares(int n) {
        while(n%4==0){
            n /= 4;
        }
        if(n%8==7){
            return 4;
        }
        for(int a = 0;a*a<n ;a++){
            int temp = (int)Math.sqrt(n - a*a);
            if(a*a + temp*temp ==n){
                if(a>0 && temp>0){
                    return 2;
                }else{
                    return 1;
                }
                
            }
        }
        return 3;
    }
}
