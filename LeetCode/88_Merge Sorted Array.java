/**
*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
*
*Note:
*You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
*The number of elements initialized in nums1 and nums2 are m and n respectively.
*/


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length<1){
            return;
        }
        int mi = 0;
        int ni = 0;
        int flag = 0;
        int arr[] = new int[nums1.length];
        while(flag<nums1.length && ni<n && mi<m){
            if(nums1[mi]>=nums2[ni]){
                arr[flag] = nums2[ni];
                ni++;
            }else{
                arr[flag] = nums1[mi];
                mi++;
            }
            flag++;
        }
        while(ni<n){
            arr[flag] = nums2[ni];
            ni++;
            flag++;
        }
        while(mi<m){
            arr[flag] = nums1[mi];
            mi++;
            flag++;
        }
        for(int i = 0 ;i<nums1.length ;i++ ){
            nums1[i] = arr[i];
        }
        
    }
}


