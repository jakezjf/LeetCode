/**
*Write a function that takes a string as input and reverse only the vowels of a string.
*
*Example 1:
*Given s = "hello", return "holle".
*Example 2:
*Given s = "leetcode", return "leotcede".
*
*Note:
*The vowels does not include the letter "y". 
*/

public class Solution {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length()-1;
        char arr[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(low<high){
            while(low<high && vowels.indexOf(arr[low]) == -1 ){
                low++;
            }
            while(low<high && vowels.indexOf(arr[high]) == -1 ){
                high--;
            }
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}

