/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

*/


public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == 1){
                return 1;
            }
            return 0;
        }
        int[] arr = new int[nums.length];
        int flag = 1;
        arr[0] = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                flag ++;
                arr[i] = flag;
            }else{
                flag = 1;
                arr[i] = flag;
            }
        }
        int result = 0;
        int temp =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=result && nums[i]!=0){
                result = arr[i];
                temp = i;
            }
        }
        if(nums[temp] == 0){
            return 0;
        }
        return result;
    }
}

