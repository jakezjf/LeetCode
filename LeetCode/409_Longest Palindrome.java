/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

*/

public class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[256];
        for(int i = 0 ;i<s.length();i++){
            arr[s.charAt(i)] = 0;
        }
        for(int i = 0 ;i<s.length();i++){
            arr[s.charAt(i)] ++;
        }
        int sum = 0;
        for(int i = 0;i<256;i++){
            if(arr[i]>0){
                sum += (arr[i]/2)*2;
            }
        }
        return sum == s.length() ? sum : sum+1;
    }
}
