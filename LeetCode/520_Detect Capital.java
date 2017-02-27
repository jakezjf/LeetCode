public class Solution {
    public boolean detectCapitalUse(String word) {
        int arr[] = new int[58];
        for(int i = 0;i<58;i++){
            arr[i] = 0;
        }
        for(int i = 0;i<word.length();i++){
            arr[word.charAt(i)-'A'] ++;
        }
        int low = 0;
        int big = 0;
        for(int i = 0;i<26;i++){
            big =  big + arr[i];
        }
        for(int i = 26;i<58;i++){
            low = low + arr[i];
        }
        if(Character.isUpperCase(word.charAt(0))){
            if(low == 0){
                return true;
            }
            if(big == 1){
                return true;
            }
        }
        System.out.println(big);
        if(big == 0){
            return true;
        }
        if(low>0 && big == 0){
            return true;
        }
        return false;
    }
}
