bool isPowerOfFour(int num) {
    while(num>4){
        if(num%4==0){
            return true;
        }else{
            return false;
        }
    }
    return false;
}
