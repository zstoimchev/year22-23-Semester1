/*
	ask the user to input 5 numbers and check how many of them are even
*/

#include <stdio.h>

int main(){
	//declare array
	int dArr[5], dEvenCount=0;

	//for loop to ask the user for input
	for(int dCount=0; dCount<5; dCount++){
		printf("Enter number %d: ", dCount+1);
		scanf("%d", &dArr[dCount]);

		//check if the number is even
		if(dArr[dCount]%2==0)
				dEvenCount++;
	}//endfor
	printf("\n %d numbers are even\n", dEvenCount);
	return 0;
}//endmain