public class Solution {
    public String reverseString(String s) {
        char[] a = s.toCharArray();
        char b;
        for (int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            b = a[i];
            a[i] = a[j];
            a[j] = b;
        }
        return String.valueOf(a);
    }
}
