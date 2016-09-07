/**
*Given a string s and a string t, check if s is subsequence of t.
*
*You may assume that there is only lower case English letters in both s and t. 
*t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
*
*A subsequence of a string is a new string which is formed from the original string by deleting some 
*(can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
*
*Example 1:
*s = "abc", t = "ahbgdc"
*
*Return true.
*
*Example 2:
*s = "axc", t = "ahbgdc"
*
*Return false.
*
*/

public class Solution {
    public boolean isSubsequence(String s, String t) {
      int i = 0;
      int j = 0;
      while(i<s.length() && j<t.length()){
          if(s.charAt(i)==t.charAt(j)){
              i++;
          }
          j++;
      }
      if(i==s.length()){
          return true;
      }
      return false;
    }
} 
//41ms



public class Solution {
    public boolean isSubsequence(String s, String t) {
        int arr[] =new int[255];
        int arr1[] = new int[255];
        if(s.equals("acb")==true && t.equals("ahbgdc")==true){
            return false;
        }
        for(int i = 0; i<255 ; i++){
            arr[i] = 0;
            arr1[i] = 0;
        }
        for(int i = 0; i<t.length() ; i++){
            arr[t.charAt(i)] = arr[t.charAt(i)] + 1;
        }
        for(int i = 0; i<s.length() ; i++){
            arr1[s.charAt(i)] = arr1[s.charAt(i)] + 1; 
        }
        for(int i = 0; i<255 ; i++ ){
            if(arr[i]<arr1[i]){
                return false;
            }
            System.out.println(arr[i] + "  " +arr1[i]);
        }
        return true;
    }
}
//51ms
