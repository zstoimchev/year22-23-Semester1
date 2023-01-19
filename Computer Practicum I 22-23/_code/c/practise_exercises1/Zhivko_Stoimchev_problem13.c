#include<stdio.h>
#include<string.h>

char check(char znak, char sTemp[]){

    if(strchr(sTemp, znak))
        return 1;
    else
        return 0;
}

int main(){

    char sString[100];
    int dCount=0, dLastCount=0;
    printf("Please enter string: ");
    scanf("%s", sString);

    for(int i=0; i<sString[i]!='\0'; i++){
        char sTemp[10]="";
        dCount=0;

        for(int j=i; sString[j]!='\0'; j++){
            if(check(sString[j], sTemp)==0){
                // strcpy(sTemp, &sString[j]);
                strncat(sTemp, &sString[j], 1);
                dCount++;
                continue;
            }
            break;
        }
        if(dCount>dLastCount)
            dLastCount=dCount;
    }
    printf("Length of the longest substring without repeating "
            "characters: %d\n", dLastCount);
    return 0;
}

