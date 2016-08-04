/**
*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.
*
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int temp =0;
        int numss[] = new int[nums.length];
        for(int c = 0;c<nums.length;c++){
            numss[c] = nums[c];
        }
        for(int a=0;a<nums.length-1;a++){
            for(int b=a+1;b<nums.length;b++){
                if(nums[a]>nums[b]){
                    temp = nums[a];
                    nums[a] = nums[b];
                    nums[b] = temp;
                }
            }
        }
        int arr[] = new int[2];
        int j=nums.length-1;
        i=0;
        while (i<j){
            if ((nums[i] + nums[j]) >target){
                j--;
            }
            if ((nums[i] + nums[j]) < target){
                i++;
            }
            if ((nums[i] + nums[j]) == target){
                arr[0] = nums[i];
                arr[1] = nums[j];
                break;
            }
        }
        for(i=0;i<numss.length;i++){
            if(arr[0]==numss[i]){
                arr[0] = i;
                break;
            }
        }
        for(i=0;i<numss.length;i++){
            if(arr[0]!=i){
            if(arr[1]==numss[i]){
                arr[1] = i;
                break;
            }
            }
        }
        return arr;
    }
    
}
