#!/bin/bash
# Basic while loop

counter=5
while [ $counter -gt 0 ]
do
echo $counter
((counter--))
done
