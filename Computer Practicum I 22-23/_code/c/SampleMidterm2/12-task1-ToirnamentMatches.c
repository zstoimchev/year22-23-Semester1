#include <stdio.h>

int main(){
	int dTeams;
	printf("Enter number of teams: ");
	scanf("%d", &dTeams);

	for(int i=1; i<=dTeams; i++)
		for(int j=1; j<=dTeams; j++)
			if(i<j)
				printf("Team %d vs Team %d\n", i, j);	
	return 0;
}
