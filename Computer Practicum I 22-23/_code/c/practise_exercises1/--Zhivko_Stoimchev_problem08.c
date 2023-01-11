#include <stdio.h>

int main()
{

    int dNumberToCheck;
    printf("Enter an integer N: ");
    scanf("%d", &dNumberToCheck);

    int dCount = 0, dPrimeNumbers = 2;
    for (int i = 2; i <= dNumberToCheck; i++){
        for (int j = 2; j < i; j++)
            if (i % j == 0)
                dCount++;
        if (dCount != 0)
            continue;
        dPrimeNumbers++;
        dCount = 0;
    }
    printf("%d\n", dPrimeNumbers);

    return 0;
}