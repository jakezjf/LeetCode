/**
*Given an array of integers, every element appears three times except for one. Find that single one.
*
*/

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int p1 = nums[i++]; //0
            int p2 = nums[i++]; //1
            int p3 = nums[i];   //2
            int ret1 = p1 ^ p2;
            int ret2 = p2 ^ p3;
            if(ret1 != 0 || ret2 != 0) {
                return p1;
            }
        }
        return nums[nums.length - 1];
    }
}
