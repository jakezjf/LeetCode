/**
*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
*For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
*the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*
*/

public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int higth = 0;
        int temp =0;
        if(nums.length==1){
            return nums[0];
        }
        while(higth<nums.length){
            temp = temp + nums[higth];
            higth ++;
            if(temp>sum){
                sum = temp;
            }
            if(temp<0){
                temp =0;
            }
        }
        return sum;
    }
}
