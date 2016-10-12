/**
* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
*
*For example,
*"A man, a plan, a canal: Panama" is a palindrome.
*"race a car" is not a palindrome.
*
*Note:
*Have you consider that the string might be empty? This is a good question to ask during an interview.
*
*For the purpose of this problem, we define empty string as valid palindrome. 
*/

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        String newS = s.toLowerCase();
        char chars[] = newS.toCharArray();
        int low = 0;
        int high = s.length()-1;
        String yu = "abcdefghijklnmopqrstuvwxyz0123456789";
        while(low<high){
            while(low<high && yu.indexOf(chars[low]) == -1 ){
                low++;
            }
            while(low<high && yu.indexOf(chars[high]) == -1){
                high--;
            }
            if(chars[low] != chars[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}

