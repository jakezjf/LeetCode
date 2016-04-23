void moveZeroes(int* nums, int numsSize) {
    int i=0;
    int count=0;
    while(i<numsSize){
        if(nums[i]==0){
            ++count;
        }else{
            nums[i-count]=nums[i];
        }
        i++;
    }
    while(count>0){
        nums[numsSize-count]=0;
        count--;
    }
}
