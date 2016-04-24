public class Solution {
    public int[] countBits(int num) {
        int arr[] = new int[num+1];
        arr[0]=0;
        for(int i=1;i<num+1;i++){
            arr[i] = arr[i&(i-1)]+1;
        }
        return arr;
    }
}
