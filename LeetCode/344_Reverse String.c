#include "stdio.h"

char* reverseString(char* s) {
    char temp[2];
	int i= 0,j=0;
    while(s[i] != '\0'){
		i++;
	}
	for(j;j<i;j++){
		i--;
		temp[1] = s[j];
		s[j] = s[i];
		s[i] = temp[1];
	}
	return s;
}
