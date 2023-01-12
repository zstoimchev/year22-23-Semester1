#include <stdio.h>

int main(){

    int dHours, dMinutes;
    float dAngle;
    printf("Input number of hours: ");
    scanf("%d", &dHours);

    printf("Input number of minutes: ");
    scanf("%d", &dMinutes);

    

    if(dHours==12)
        dHours=0;
    if(dMinutes==60){
        dMinutes=0;
        dHours+=1;
    }


    dAngle=(dMinutes/5)*30+((1-(float)dMinutes/60)*30);
    printf("The angle between the hands are %.2f and %.2f degrees.\n", dAngle, 360-dAngle);

    return 0;
}