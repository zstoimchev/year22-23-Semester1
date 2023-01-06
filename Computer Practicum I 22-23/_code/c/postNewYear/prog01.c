#include <stdio.h>
//#include <math.h>

int my_fun(int a, int b){
	return a+b;
}

int power(int n, int p){
	int res=1;
	for(int i=0; i<p; i++)
		res*=n;
	return res;

}


int main(){

	printf("%d\n", power(2,5));
	return 0;
}