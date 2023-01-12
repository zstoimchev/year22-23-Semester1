#include <stdio.h>

int main()
{
	int hours, minutes;

	printf("Enter the number of hours: ");
	scanf("%d", &hours);

	printf("Enter the number of minutes: ");
	scanf("%d", &minutes);

	// Calculate the angle of the hour hand relative to 12 o'clock
	double hour_angle = (hours % 12) * 30 + (minutes / 60.0) * 30;

	// Calculate the angle of the minute hand relative to 12 o'clock
	double minute_angle = minutes * 6;

	printf("Angle between hour and 12 o'clock: %.2f degrees\n", hour_angle);
	printf("Angle between minute and 12 o'clock: %.2f degrees\n", minute_angle);

	return 0;
}
