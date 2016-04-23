#include "stdio.h"

int addDigits(int num) {
	while(add(num)>=10){
		return addDigits(add(num));
	}
	return add(num);
}

int add(int num){
		int a;
	if(num>0){
		a = num - (num/10)*10; 
		return a + add(num/10);
	}
	else if(num=0){
		return 0;
	}else{
		return 0;
	}
}

void main(){
    int i;
    scanf("%d",&i);
    printf("%d",addDigits(i));
}
