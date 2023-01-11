#include <stdio.h>

int check_prime(int dNumber){
    for(int i=2; i<dNumber; i++){
        if(dNumber%i==0){
            return 1;
        }
    }
    return 0;
}

int main()
{

    int dNumberToCheck, dCount=0;
    printf("Enter an integer N: ");
    scanf("%d", &dNumberToCheck);

    for(int i=1; i<dNumberToCheck; i++){
        if(check_prime(i)==0)
            dCount++;
    }

    // int dCount = 0, dPrimeNumbers = 2;
    // for (int i = 2; i <= dNumberToCheck; i++){
    //     for (int j = 2; j < i; j++)
    //         if (i % j == 0)
    //             dCount++;
    //     if (dCount != 0)
    //         continue;
    //     dPrimeNumbers++;
    //     dCount = 0;
    // }
    printf("%d\n", dCount);

    return 0;
}