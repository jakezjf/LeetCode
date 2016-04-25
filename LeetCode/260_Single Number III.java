public class Solution {
    public int[] singleNumber(int[] nums) {
        int result=0;
        int arr[] =new int[2];
        for(int i=0;i<nums.length;i++){
        result ^= nums[i];
        }
        int j=0;
        while(j<result){
            
        }
        arr[0]=result;
        arr[1]=result;
        return arr;
    }
}
