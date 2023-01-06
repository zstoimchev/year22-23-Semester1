#include <stdio.h>
#include<stdlib.h>
#include<math.h>

int power(int n, int p){
	int res=1;
	if(p==0)
		return 1;
	else{
		for(int i=0; i<abs(p); i++)
			res=res*n;
	}

	if(p<0)
			return 1/res;
	else
		return res;
}

int main(){

	int a=4, b=5, c=6;

	int res2=power(2,a);
	int res3=power(3,b);
	int res4=power(4,c);

	printf("%d\n", (res2+res3-res4));


	return 0;
}





	