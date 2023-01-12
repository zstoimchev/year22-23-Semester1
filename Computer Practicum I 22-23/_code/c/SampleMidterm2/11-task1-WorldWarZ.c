#include <stdio.h>

//start main
int main(){
	//declare variable
	int dNum;
	printf("Enter number: ");
	scanf("%d", &dNum);

	//print first column
	for (int i = 0; i < dNum; i++)
		printf("*");
	printf("\n");

	//print middle3
	for (int i = 1; i < dNum-1; i++)
	{
		for (int j = 0; j < dNum; j++)
		{
			if(j==dNum-1-i)
				printf("*");
			else
				printf(" ");
		}//endinner
		printf("\n");
	}//endfor

	//print last row
	for (int i = 0; i < dNum; i++)
		printf("*");

}//end main