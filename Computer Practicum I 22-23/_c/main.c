#include <stdio.h>

int main(){
	printf("Hello, World!\n");

	//check for orr or even
	printf("Enter two numbers: ");
	int dNum1, dNum2;
	scanf("%d %d", &dNum1, &dNum2);
	if(dNum1/2*2==dNum1)
		printf("%d is even..\n", dNum1);
	else printf("%d is odd...\n", dNum1);
	if(dNum2/2*2==dNum2)
		printf("%d is even..\n", dNum2);
	else printf("%d is odd...\n", dNum2);

	//check for greater number
	if(dNum1>dNum2)
		printf("%d is greater than %d\n\n", dNum1, dNum2);
	else if(dNum2>dNum1)
		printf("%d is greater than %d\n", dNum2, dNum1);
	else printf("%d %d are equal\n", dNum1, dNum2);

	return 0;
} //end of main