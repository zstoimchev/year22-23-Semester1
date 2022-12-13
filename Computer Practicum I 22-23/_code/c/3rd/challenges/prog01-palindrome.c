/*
	Ask the user to enter a 4 digit integer. The program should determine
	if the number is palindrome
*/

#include <stdio.h>

int main(){
	int dNumber;
	printf("Enter 4-digit number: ");
	scanf("%d", &dNumber);
	if(dNumber>9999 || dNumber<1000)
		return 0;
	int dTemp=dNumber, dReversed=0;;
	while(dTemp>0){
		dReversed=dReversed*10+dTemp%10;
		dTemp/=10;
	}//endwhile
	if(dReversed==dNumber)
		printf("The number %d is palindrome\n", dNumber);
	else
		printf("The number %d is not palindrome\n", dNumber);
	return 0;
}//endfor