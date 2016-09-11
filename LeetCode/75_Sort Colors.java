/**
*Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
*
*Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
*
*Note:
*You are not suppose to use the library's sort function for this problem.
*
* 1ms
*/

public class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<2){
            return;
        }
        if(nums.length==2){
            if(nums[0]>nums[1]){
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
            return;
        }
        int i = 0;
        int j;
        int index = 0;
        while(i<nums.length){
            j = nums.length-1;
            if(nums[i]!=index){
                while(j>i){
                    if(nums[j]==index){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                    if(j == (i+1)){
                        index ++;
                        i--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
    }
}



