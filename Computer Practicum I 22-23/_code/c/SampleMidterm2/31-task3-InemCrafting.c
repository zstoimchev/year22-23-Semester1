#include <stdio.h>

int main(){
	int dPicaxes, dSwords, dBeads;
	int dCount=0;

	printf("Number of pickaxes: ");
	scanf("%d", &dPicaxes);
	
	printf("Number of long swords: ");
	scanf("%d", &dSwords);
	
	printf("Number of rejuvenation beads: ");
	scanf("%d", &dBeads);

	while(dPicaxes-1>=0 && dSwords-1>=0 && dBeads-2>=0){
		dPicaxes--;
		dSwords--;
		dBeads-=2;
		dCount++;
	}

	printf("Maximum number of Tiamat items you can craft: %d\n", dCount);
	printf("Number of pickaxes: %d\n", dPicaxes);
	printf("Number of long swords: %d\n", dSwords);
	printf("Number of rejuvenation beads: %d\n", dBeads);
	return 0;
}
