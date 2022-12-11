#!/bin/bash
#

if [ $# -lt 3 ]
then
	echo "command line arguments are missing"
elif [ $1 -gt $2 ] && [ $1 -gt $3 ]
then
	echo "The greatest integer from the given three is $1"
elif [ $2 -gt $1 ] && [ $2 -gt $3 ]
then
	echo "The greatest integer from the given three is $2"
else
	echo "The greatest integer from the given three is $3"
fi
