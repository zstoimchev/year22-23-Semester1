#include <stdio.h>

int main(){
	int dNum;
	printf("Enter number (even): ");
	scanf("%d", &dNum);

	int dTemp=dNum+1;

	for(int i=1; i<=dNum; i++){
		printf("%d %d ", i, dTemp-i);
	}	
	
	return 0;
}