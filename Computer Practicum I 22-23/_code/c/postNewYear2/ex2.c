#include <stdio.h>
#include <string.h>

struct Book{
	int pages;
	char title[50];
	char author[50];
	float rating;
};

struct Library{
	char name[50];
	int number_of_books;
	struct Book collection[50];
};

int main(){

	struct Library Lib;

	strcpy(Lib.name, " CP1 lib");
	Lib.number_of_books=3;

	Lib.collection[0].pages=100;
	strcpy(Lib.collection[0].title, "C programming");

	Lib.collection[1].pages=200;
	strcpy(Lib.collection[1].title, "B programming");

	Lib.collection[2].pages=300;
	strcpy(Lib.collection[2].title, "A programming");

	for(int i=0; i<Lib.number_of_books; i++){
		printf("%s, pages: %d\n", Lib.collection[i].title, Lib.collection[i].pages);
	}


	return 0;
}