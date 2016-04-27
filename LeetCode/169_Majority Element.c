int majorityElement(int* nums, int numsSize) {
    int num=1;
    int i;
    int temp = nums[0];
    for(i=1;i<numsSize;i++){
        if(num==0){
            temp = nums[i];
        }
        if(nums[i]==temp){
            num++;
        }else{
            num--;
        }
    }
    return temp;
}
