#!/bin/bash
#zhivko_stoimchev_89221056

sort -k4 -n expenses_people.csv -o ordered_expenses.txt	#sorting the file by Income column in ascending order

read -p "which username are you interested in: " username	#reading username that the user is interested in

if grep -q $username ./ordered_expenses.txt ; then	#check if the username is found in the text file
	grep $username ordered_expenses.txt | cut -d' ' -f 3,4	#prints income and expensed for the requested user
else
	echo 'the name cannot be found';	#printing error and
	exit 1					#exiting the script
fi

read -p 'are you interested in how many times a certain pattern occurs in the file? yes/no ' answer
if [ $answer == "yes" ]
then
	read -p 'Which pattern are you interested in? ' pattern
	echo "$pattern is found $(grep -c $pattern ordered_expenses.txt) times"	#prints how many times a certain pattern occurs in the file, using grep
else [ $answer == "no" ]
	echo "Goodbye"
	exit
fi

