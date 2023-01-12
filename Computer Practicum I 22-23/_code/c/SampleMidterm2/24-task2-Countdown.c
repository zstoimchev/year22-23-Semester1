#include <stdio.h>

int main(){
    
    int dCurrentH, dCurrentM, dDeadH, dDeadM;
    printf("Current hour: ");
    scanf("%d", &dCurrentH);

    printf("Current minute: ");
    scanf("%d", &dCurrentM);

    printf("Deadline hour: ");
    scanf("%d", &dDeadH);

    printf("Deadline minute: ");
    scanf("%d", &dDeadM);

    printf("You have %d minutes left!\n", (dDeadH-dCurrentH)*60+(dDeadM-dCurrentM));
}