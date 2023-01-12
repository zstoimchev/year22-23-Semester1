#include <stdio.h>

int main(){
	int dNum;
	printf("Enter number (even): ");
	scanf("%d", &dNum);

	int dTemp=dNum;

	for(int i=0; i<dNum; i++)
		printf("%d %d ", i+1, dTemp-i);
	
	return 0;
}