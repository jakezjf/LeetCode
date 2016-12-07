/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?



*/


// public class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char[] ss = s.toCharArray();
//         char[] tt = t.toCharArray();
//         int[] arr = new int[128];
//         int sum = 0;
//         for(int i = 0;i < s.length();i++){
//             if(++arr[ss[i]]==1){
//                 sum++;
//             }
//             if(--arr[tt[i]]==0){
//                 sum--;
//             }
//         }
//         return sum == 0;
//     }
// }


public class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(int i = 0;i<s.length();i++) arr[s.charAt(i) - 'a']++;
        for(int i = 0;i<t.length();i++) arr[t.charAt(i) - 'a']--;
        for(int a : arr){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
}
