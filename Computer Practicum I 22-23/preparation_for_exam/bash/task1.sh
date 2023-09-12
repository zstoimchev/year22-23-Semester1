#!/bin/bash

echo -n "Enter a desired file name: " 
read filename
echo -n "Enter a range represented as 2 numbers: "
read A B

if [ $A -gt $B ]
then
	 echo "Wrong input!"
	 echo "Exiting the program with Error Code 503"
else	
		for i in $(seq $A $B);
		do
				echo "${filename}_$i.txt" > "${filename}_$i.txt"
		done
fi

echo ~/home | ls -lah > contents.txt
cat contents.txt