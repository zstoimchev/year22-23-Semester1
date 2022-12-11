#!/bin/bash 

echo -n "Enter first digit: "
read a
echo -n "Enter second digit: "
read b
c=$[a+b]
echo "The sum of the two integers is $c"

if [ $c -gt 10 ]
then
	echo "Greater than 10"
else
	echo "less than 10"
fi
