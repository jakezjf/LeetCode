/**
*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
*Examples:
*s = "leetcode"
*return 0.
*s = "loveleetcode",
*return 2.
*
*/
public class Solution {
    public int firstUniqChar(String s) {
       char arr[] = s.toCharArray();
        int a[] = new int[255];
        for(int i = 0;i<arr.length; i++){
            a[arr[i]]++;
        }
        for (int i = 0;i<arr.length;i++){
            if (a[arr[i]]==1){
                return i;
            }
        }
        return -1;
    }
}

