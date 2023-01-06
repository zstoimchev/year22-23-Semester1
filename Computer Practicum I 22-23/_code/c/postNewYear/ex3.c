#include <stdio.h>

int magic_num(int n){
	int sum=0;
	for(int i=1; i<n; i++){
		if(n%i==0)
			sum+=i;
	}
	if(n==sum)
		return 1;
	else
		return 0;
}

int main(){

	int arr[6]={1,2,3,4,5,6};

	for(int i=0; i<6; i++){
		if(magic_num(arr[i])==1)
			printf("%d ", arr[i]);
	}

	int sum=0;
	for(int i=0; i<6; i++){
		sum+=arr[i];
	}

	printf("Array is magic: %d\n", magic_num(sum));
	return 0;
}