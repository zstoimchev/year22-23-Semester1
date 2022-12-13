/*
	Ask the user to enter 10 integers in an array. Print the contents
	of the array. Then sort the array in accending order the print the
	sorted array. Consider duplicate numbers in your solution.
*/

#include <stdio.h>

int main(){
	//declare variable
	int dArr[10];

	//create for loop
	for(int dCount=0; dCount<10; dCount++){
		printf("Enter the %d number: ",dCount+1 );
		scanf("%d", &dArr[dCount]);
	}//endfor

	for(int dCount1=0; dCount1<10; dCount1++){
		printf(" %d ", dArr[dCount1]);
		int dTemp=dArr[dCount1], dIndex=dCount1;
		for(int dCount2=dCount1; dCount2<10; dCount2++){
			if(dTemp>dArr[dCount2]){
				dTemp=dArr[dCount2];
				dIndex=dCount2;
			}//endif
		}//endinnerfor
		int dtemp=dArr[dCount1];
		dArr[dCount1]=dTemp;
		dArr[dIndex]=dtemp;

	}//endmainfor

	printf("\n");

	for(int dCount=0; dCount<10; dCount++){
		printf(" %d ",dArr[dCount] );
	}//endprintfor
	printf("\n");

	return 0;
}//endmain