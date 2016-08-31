/**
*Given two strings s and t which consist of only lowercase letters.
*
*String t is generated by random shuffling string s and then add one more letter at a random position.
*
*Find the letter that was added in t.
*
*Example:
*
*Input:
*s = "abcd"
*t = "abcde"
*
*Output:
*e
*
*Explanation:
*'e' is the letter that was added.
*
*/

public class Solution {
    public char findTheDifference(String s, String t) {
        int arr[] = new int[255];
        int arr1[] = new int[255];
        int temp = 0;
        for(int i = 0 ; i < 255 ; i++){
            arr[i] = 0;
            arr1[i] = 0;
        }
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i)]++;
        }
        for(int i = 0 ; i < t.length() ; i++){
            arr1[t.charAt(i)]++;
        }
        for(int i = 0 ; i < 255 ; i++ ){
            if(arr[i] != arr1[i]){
                System.out.println(i);
                temp = i;
                break;
            }
        }
        return (char)(temp); 
    }
}
