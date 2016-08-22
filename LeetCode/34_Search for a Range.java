/**
*Given a sorted array of integers, find the starting and ending position of a given target value.
*Your algorithm's runtime complexity must be in the order of O(log n).
*If the target is not found in the array, return [-1, -1].
*For example,
*Given [5, 7, 7, 8, 8, 10] and target value 8,
*return [3, 4].
*/

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length <=2){
            int index = 0;
            int temp = 0;
            int[] arr = new int[2];
            for(int i = 0;i <nums.length ; i++){
                if(nums[i] == target){
                    arr[index++] = i;
                    temp ++;
                }
            }
            if(temp==0){
                arr[0] = -1;
                arr[1] = -1;
            }
            if(temp==1){
                arr[1] = arr[0];
            }
            return arr;
        }
        int[] arr = new int[2];
        int index = 0;
        int temp =0;
        for(int i = 0;i <nums.length ; i++){
            if(nums[i] == target && temp<2){
                arr[index++] = i;
                temp++;
            }
            if(temp>=2 && nums[i] == target){
                arr[1] = i;
            }
        }
        if(temp==0){
            int[] a = new int[2];
            a[0] = -1;
            a[1] = -1;
            return a;
        }
         if(temp==1){
                arr[1] = arr[0];
            }
        return arr;
    }
}
