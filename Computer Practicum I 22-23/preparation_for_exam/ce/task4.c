#include <stdio.h>
#include <string.h>

void print_grid(char cArray[10][10]) {
  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++)
      printf("%c ", cArray[i][j]);
    printf("\n");
  }
}

void reserve_seat(char cArray[10][10], int dSeatNum) {
  if (dSeatNum < 10) {
    if (cArray[0][dSeatNum - 1] != '_') {
      cArray[0][dSeatNum - 1] = '_';
      printf("Seat %d has been successfully reserved!\n", dSeatNum);
    } else
      printf("The seat is already reserved!\n");
  } else {
    int row = dSeatNum / 10;
    int col = dSeatNum % 10;
    if (cArray[row][col] != '_') {
      cArray[row][col - 1] = '_';
      printf("Seat %d has been successfully reserved!\n", dSeatNum);
    } else
      printf("The seat is already reserved!\n");
  }
}

int main() {
  char cGrid[10][10];
  char cAnswer[3] = "/";
  int dSeatNumber;
  for (int i = 0; i < 10; i++)
    for (int j = 0; j < 10; j++)
      cGrid[i][j] = 'A';
  printf("Welcome to the Cinema Reservation System!\nCurrent Seating Map:\n");
  print_grid(cGrid);

  while (strcmp(cAnswer, "no") != 0) {
    printf("Please enter the seat number you wish to reserve (1-100): ");
    scanf("%d", &dSeatNumber);

    reserve_seat(cGrid, dSeatNumber);
    print_grid(cGrid);
    printf("Would you like to reserve another seat? (yes/no): ");
    scanf("%s", cAnswer);
  }
  printf("Thank you for using the C Cinema Reservation System! Goodbye.\n");
}