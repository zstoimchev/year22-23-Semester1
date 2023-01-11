#include<stdio.h>

int main(){

    int dR=0;
    int dC=0;

    while((dR>=10 || dR<=0) && (dC>=10 || dC<=0)){
        printf("Enter positive integers R and C: ");
        scanf("%d", dR);
        scanf("%d", dC);
    }
    return 0;
}