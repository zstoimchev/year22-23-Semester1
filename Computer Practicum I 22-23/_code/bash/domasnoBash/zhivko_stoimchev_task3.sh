#!/bin/bash

declare -a arr
read -p 'number of lines in the fragment: ' n

for (( i=0; i<n; i++ ))
do
	read -p 'Enter HTML tag: ' tag
	var1=$(echo $tag | grep -Eo "(http|https)://[a-zA-Z0-9./?=_%:-]*")
	var2=$(echo $tag | grep -Po "(?<=>)([\w\s\.]+)(?=<\/)")
	arr+=("$var1,$var2")
done

for i in "${arr[@]}"; do echo "$i"; done


