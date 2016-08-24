/**
* Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   
*
*Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
*
*Note:
*You may assume that both strings contain only lowercase letters.
*
*canConstruct("a", "b") -> false
*canConstruct("aa", "ab") -> false
*canConstruct("aa", "aab") -> true
*
*/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        if(ransomNote.length()==magazine.length()){
            if(ransomNote.equals(magazine)){
            return true;
            }
            return false;
        }
        if(ransomNote.equals(" ")==true){
            return false;
        }
       int a[] = new int[255];
       int b[] = new int[255];
       char arr[] = ransomNote.toCharArray();
       for(int i = 0;i<arr.length; i++){
            a[arr[i]]++;
        }
        char brr[] = magazine.toCharArray();
        for(int i = 0;i<brr.length; i++){
            b[brr[i]]++;
        }
        for(int i = 0;i<arr.length; i++){
            if(b[arr[i]]<a[arr[i]]){
                return false;
            }
        }
        return true;
    }
}
