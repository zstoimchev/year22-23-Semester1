#include <stdio.h>

int main(){
	int dNum;
	int dSum=0;
	printf("Enter number: ");
	scanf("%d", &dNum);

	for(int i=1; i<dNum; i++){
		if(dNum%i==0)
			dSum+=i;
	}//end for

	if(dSum==dNum)
		printf("%d is perfect number.\n", dNum);
	else
		printf("%d is not a perfect number\n", dNum );
	
	return 0;
}