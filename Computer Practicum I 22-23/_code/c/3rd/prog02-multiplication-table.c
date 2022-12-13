/*
	create multiplication matrix
*/

#include <stdio.h>

int main(){
	//declare variables
	int dFactor1=1;
	int dFactor2=1;

	//create for loop
	for( ; dFactor1<=10; dFactor1++ ){
		for( int dFactor2=1; dFactor2<=10; dFactor2++){
			printf(" %d\t", dFactor1*dFactor2);
		}//end2ndfor
		printf("\n\n");
	}//end1stfor
	return 0;
}//endmain