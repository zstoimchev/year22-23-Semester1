#!/bin/bash
#numbers divisable with 5 between 1 and 100

#counter=1
#while [ $counter -le 100 ]
#do
#	if (( counter % 5 == 0  ))
#	then
#		echo $counter
#	fi
#	(( counter++ ))
#done

for (( i=1; i<101; i++ ))
do
	if (($i % 5 == 0))
	then
		echo $i
	fi
done
