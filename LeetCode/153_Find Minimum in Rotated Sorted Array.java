/**
*Suppose a sorted array is rotated at some pivot unknown to you beforehand.
*
*(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
*
*Find the minimum element.
*
*You may assume no duplicate exists in the array.
*
* 1ms
*/

public class Solution {
    public int findMin(int[] nums) {
      int i =1;
      int temp = nums[0];
      while(i<nums.length){
          if(nums[i]<temp){
              temp = nums[i];
          }
          i++;
      }
      return temp;
    }
}
