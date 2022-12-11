#!/bin/bash
#add two numbers from terminal and print it's result, otherwise show error if number is missing

if [ $# -lt 2 ]
then
	echo "command line arguments are missing"
else
	echo $(($1+$2))
fi


