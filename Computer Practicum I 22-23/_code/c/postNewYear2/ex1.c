#include <stdio.h>
#include <string.h>

struct Triangle{
	int a;	//first side
	int b;	//length of second side
	int c;	//length of third side
	char color;	//color of the triangle
};

int main(){

	struct Triangle Triang;

	char color;
	printf("Enter the sides of the triangle and it's color: ");
	scanf("%d%d%d%s", &Triang.a, &Triang.b, &Triang.c, &Triang.color);

	//scanf("%s", &Triang.color);


	if(Triang.a==Triang.b && Triang.a==Triang.c){
		Triang.color='g';
	}



	printf("\nYour triangle has sides with length %d, %d, %d and color %c\n", Triang.a, Triang.b, Triang.c, Triang.color);


	return 0;
}