/*
	create multiplication table
*/

#include <stdio.h>

int main(){
	//declare variable
	int dFactor;

	//create for loop
	for(; dFactor<=10; dFactor++){
		printf("%d x %d = %d\n", dFactor, dFactor, dFactor*dFactor);
	}//endfor
	
	return 0;
}//endmain
