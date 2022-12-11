#!/bin/bash

sort -k4 -n expenses_people.csv -o ordered_expenses.txt

read -p "which username are you interested in: " username

if grep -q $username ./expenses_people.csv ; then
	grep $username expenses_people.csv | cut -d' ' -f 3,4
else
	echo 'the name cannot be found';
	exit 1
fi


read -p 'are you interested in how many times a certain pattern occurs in the file? yes/no ' answer
if [ $answer == "yes" ]
then
	read -p 'Which pattern are you interested in? ' pattern
	grep -c $pattern ordered_expenses.txt
else [ $answer == "no" ]
	echo "Goodbye"
	exit
fi

#-eoc
