/**
*Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*
*/

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        if(haystack.length()==0){
            return 0;
        } 
        int hl = haystack.length();
        int nl = needle.length();
        if(hl==nl){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }
        for(int i = 0; i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+nl).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
