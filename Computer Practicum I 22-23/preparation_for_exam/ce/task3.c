#include <stdio.h>
#include <math.h>

int check_length(int dNumber)
{
  int dCounter = 0;
  while (dNumber > 0)
  {
    dCounter++;
    dNumber /= 10;
  }
  return dCounter;
}

int check_armstrong(int dNumber, int dNumLength)
{
  int dCounter = 0;
  int dTempValue = dNumber;
  for (int i = 0; i < dNumLength; i++)
  {
    int dDigit = dTempValue % 10;
    dTempValue /= 10;
    dCounter += pow(dDigit, dNumLength);
  }
  if (dCounter == dNumber)
    return 1;
  else
    return 0;
}

int main()
{
  int dNumber;
  do
  {
    printf("Enter number You want to check if it is Armstrong: ");
    scanf("%d", &dNumber);
  } while (dNumber <= 0);

  int dNumberLength = check_length(dNumber);

  if (check_armstrong(dNumber, dNumberLength))
    printf("True\n");
  else
    printf("False\n");
}