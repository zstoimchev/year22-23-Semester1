#!/bin/bash
#shell script to find the greatest of three numbers

echo -n "Enter Num1: "
read num1
echo -n "Enter Num2: "
read num2
echo -n "Enter Num3: "
read num3

if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]
then
    echo $num1
elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]
then
    echo $num2
else
    echo $num3
fi
