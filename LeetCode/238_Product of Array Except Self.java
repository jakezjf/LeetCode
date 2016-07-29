/**Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].
 * 
 */

public class Solution {
    public int[] productExceptSelf(int[] nums) {
       int sum = 1;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                sum *= nums[i];
            }else{
                count ++;
            }
        }
        int arr[] = new int[nums.length];
        if (count>1){
            for (int j=0;j<nums.length;j++) {
                arr[j] = 0;
            }
        }else{
            if (count ==1){
                for (int j=0;j<nums.length;j++){
                    if (nums[j]==0){
                        arr[j]= sum;
                    }else {
                        arr[j] = 0;
                    }
                }
            }else {
                for (int j=0;j<nums.length;j++){
                    if (nums[j]==0){
                        arr[j]= sum;
                    }else {
                        arr[j] =sum /nums[j];
                    }
                }
            }
        }
        return arr;
    }
}
