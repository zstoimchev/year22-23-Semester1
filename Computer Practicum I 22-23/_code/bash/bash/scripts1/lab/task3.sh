#!/bin/bash

echo $1>temp	#to replace everything in the file, to be as new as it once was
echo $2>>temp
echo $3>>temp

sort -r ./temp

