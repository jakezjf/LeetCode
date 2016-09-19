/**
*
*Follow up for H-Index: What if the citations array is sorted in ascending order? Could you optimize your algorithm?
*/

public class Solution {
    public int hIndex(int[] citations) {
        int i = 0;
        int mid;
        int len = citations.length;
        int h = citations.length-1;
        while(i<=h){
            mid = i + (h -i)/2;
            if(citations[len-mid-1]>mid){
                i = mid + 1;
            }else{
                h = mid -1;
            }
        }
        return i;
    }
}
