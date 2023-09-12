#include <stdio.h>

int order_num_inc(int dNum_to_check)
{
  int dFirst = dNum_to_check / 100;
  int dSecond = dNum_to_check / 10 % 10;
  int dThird = dNum_to_check % 10;
  if (dFirst < dSecond)
  {
    int temp = dFirst;
    dFirst = dSecond;
    dSecond = temp;
  }
  if (dFirst < dThird)
  {
    int temp = dThird;
    dThird = dFirst;
    dFirst = temp;
  }
  if (dSecond < dThird)
  {
    int temp = dThird;
    dThird = dSecond;
    dSecond = temp;
  }
  int dResult = (((dFirst * 10) + dSecond) * 10) + dThird;
  return dResult;
}

int reverse(int num)
{
  int res = 0;
  while (num > 0)
  {
    res = res * 10 + num % 10;
    num /= 10;
  }
  return res;
}

int verify_repeating(int dNumber)
{
  int dFirst = dNumber / 100;
  int dSecond = dNumber / 10 % 10;
  int dThird = dNumber % 10;
  if (dFirst == dSecond && dSecond == dThird)
    return 1;
  return 0;
}

int main()
{
  int dNumber;
  do
  {
    printf("Enter number You want to check: ");
    scanf("%d", &dNumber);
  } while ((dNumber < 100 || dNumber > 1000) || ((dNumber - reverse(dNumber)) == 0));

  for (int i = 0; i < 6; i++)
  {
    int dIncreasing = order_num_inc(dNumber);
    int dDecreasing = reverse(dIncreasing);
    int dResult;
    if (dIncreasing > dDecreasing)
      dResult = dIncreasing - dDecreasing;
    else
      dResult = dDecreasing - dIncreasing;

    printf("Iteration %d: %d - %d = %d\n", i + 1, dIncreasing, dDecreasing, dResult);
    dNumber = reverse(dResult);
    if (reverse(dNumber) == 495)
    {
      int dIncreasing = order_num_inc(dNumber);
      int dDecreasing = reverse(dIncreasing);
      int dResult;
      if (dIncreasing > dDecreasing)
        dResult = dIncreasing - dDecreasing;
      else
        dResult = dDecreasing - dIncreasing;
      printf("Iteration %d: %d - %d = %d\n", i + 2, dIncreasing, dDecreasing, dResult);
      break;
    }
  }
  return 0;
}