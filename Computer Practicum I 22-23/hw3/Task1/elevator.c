#include <stdio.h>
#include <stdlib.h>

#define FLOORS 5

int main()
{
    // int dCurrentFoor = 1;
    // int dNextFloor;

    int true = 1;

    char cCurrentFloor = 'G';
    char cNextFloor;

    while (true)
    {
        printf("You are currently on floor %c. Which floor do you want to go (G, 1, 2, 3, 4, 5): ", cCurrentFloor);
        scanf(" %c", &cNextFloor);

        if ((int)(cCurrentFloor) == (int)(cNextFloor))
            continue;

        if ((int)(cNextFloor) < 49 || (int)(cNextFloor) > 53 && (int)(cNextFloor) != 71)
            continue;

        printf(" Going to floor %c\n", cNextFloor);
        cCurrentFloor = cNextFloor;
    }
    return 0;
}
