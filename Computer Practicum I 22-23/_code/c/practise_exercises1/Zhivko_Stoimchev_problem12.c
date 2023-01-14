#include <stdio.h>

int main()
{
    int dLength;
    printf("Enter the length of the array: ");
    scanf("%d", &dLength);

    int dArr[dLength];
    char dTemp[dLength];

    for (int i = 0; i < dLength; i++)
    {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &dArr[i]);
        dTemp[i] = (char)dArr[i];
    }

    int dCount1 = 0;
    int dCount2 = 0;

    for (int i = 0; i < dLength; i++){
        if (dArr[i] != -00){
            dCount1 = 0;
            for (int j = i + 1; j < dLength; j++){
                if (dArr[i] == dArr[j]){
                    dCount1++;
                    dArr[j] = -00;
                }
            }
            if (dCount1 > 0){
                dCount2++;
            }
            dArr[i] = 321;
        }
    }

    printf("%d\n", dCount2);
}