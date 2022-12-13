/*
	calculate salary rate...
*/

#include <stdio.h>
#define HOURLY_RATE 5.21

int main(){
	//declare variables
	float fSalary=0.0;
	int dHours=0, dDay=0;
	//const float HOURLY_RATE=5.21;

	//ask the user how many days they worked and how many hours for that day
	printf("How many days did you work: ");
	scanf("%d", &dDay);

	//create for to loop through the days
	for(int dCount=1; dCount<=dDay; dCount++){
		printf("How many hours did you work on day %d? ", dCount);
		scanf("%d", &dHours);
		fSalary+=dHours*HOURLY_RATE;
		printf("You earned %2.f in day %d\n", dHours*HOURLY_RATE, dCount);
	}//endfor

	//print the final salary
	printf("\n Fot\r total of %d days, you earned %2.f.\n", dDay, fSalary);
	return 0;
}//endmain