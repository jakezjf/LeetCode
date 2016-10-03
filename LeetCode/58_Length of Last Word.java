/**
*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
*
*If the last word does not exist, return 0.
*
*Note: A word is defined as a character sequence consists of non-space characters only.
*
*For example, 
*Given s = "Hello World",
*return 5.
*/

public class Solution {
    public int lengthOfLastWord(String s) {
        int j = 0;
        int temp = 0;
        for(int i = 0;i<s.length() ;i++){
            if (s.charAt(i)!=' '){
                j++;
                temp = j;
            }
            if (s.charAt(i)==' '){
                j = 0;
            }
        }
        return temp;
    }
    
     public int lengthOfLastWord1(String s) {
        int j = 0;
        boolean flag = true;
        for(int i = s.length()-1;i>=0  ;i--){
            if(s.charAt(i)==' ' && flag == false){
                break;
            }
            if (s.charAt(i)!=' '){
                flag = false;
                j++;
            }
        }
        return j;
    }
}


