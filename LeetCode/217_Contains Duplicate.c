bool containsDuplicate(int* nums, int numsSize) {
    int sum =0;
    int i,j;
    for(i=0;i<numsSize-1;i++){
        for(j=i+1;j<numsSize;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
}
