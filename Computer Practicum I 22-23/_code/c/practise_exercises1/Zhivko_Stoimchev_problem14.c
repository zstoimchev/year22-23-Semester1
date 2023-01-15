#include<stdio.h>

int check_length(int n){
    int dCount=0;
    while(n>0){
        n/=10;
        dCount++;
    }
    return dCount;
}

int main(){

    int dYear;
    while(dYear<=0 && dYear>1000){
        printf("Enter a year between 0 and 1000: ");
        scanf("%d", &dYear);
    }

    int dTemp=dYear;

    int dLength=check_length(dYear);

    while(dLength>0){

        dTemp
    }






    return 0;
}