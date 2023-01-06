#include <stdio.h>
#include <string.h>

struct Book{
	int pages;
	char title[50];
	char author[50];
};

int main(){
	struct Book Book1;

	Book1.pages=50;
	strcpy(Book1.title, "C program");

	printf("We have a book called %s, with %d pages", Book1.title, Book1.pages);


	return 0;
}