public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] arr = new int[128];
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            if(++arr[ss[i]]==1){
                sum++;
            }
            if(--arr[tt[i]]==0){
                sum--;
            }
        }
        return sum == 0;
    }
}
