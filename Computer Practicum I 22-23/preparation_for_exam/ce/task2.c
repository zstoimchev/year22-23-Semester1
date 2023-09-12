#include <stdio.h>

int check_factoriel(int dNumber)
{
  int dFactoriel = 1;
  for (int i = 1; i <= dNumber; i++)
  {
    if (i % 3 == 0)
      dFactoriel *= i;
  }
  return dFactoriel;
}

int main()
{
  int dNumber, dNumbersToCheck;
  do
  {
    printf("How many numbers you want to check? ");
    scanf("%d", &dNumbersToCheck);
  } while (dNumbersToCheck <= 0);

  int dResultArr[dNumbersToCheck];

  for (int i = 0; i < dNumbersToCheck; i++)
  {
    printf("Enter number to check factorial for: ");
    scanf("%d", &dNumber);
    if (dNumber <= 0)
      continue;
    dResultArr[i] = check_factoriel(dNumber);
  }

  for (int i = 0; i < dNumbersToCheck; i++)
    printf("%d\t", dResultArr[i]);
  printf("\n");
  return 0;
}
