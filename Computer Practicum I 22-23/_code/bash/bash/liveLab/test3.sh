#!/bin/bash

read -p "number of arguments: " n

declare -a var2

for (( i=0; i<n; i++ ))
do
        read -p 'Enter HTML tag: ' tag
        echo $tag >> urls.txt
        var1=($(cat urls.txt | grep -Eo "(http|https)://[a-zA-Z0-9./?=_%:-]*"))
	var2=($(cat urls.txt | grep -Eo "(a-zA-Z0-9./?=_%:-)\">[a-zA-Z]*" ))
done


echo ${var1[@]}
