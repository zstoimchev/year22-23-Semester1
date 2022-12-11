#!/bin/bash
#zhivko_stoimchev_89221056

declare -a arr	#declaring an array
read -p 'number of lines in the fragment: ' n

for (( i=0; i<n; i++ ))
do
	read -p 'Enter HTML tag: ' tag
	var1=$(echo $tag | grep -Eo "(http|https)://[a-zA-Z0-9./?=_%:-]*")	#extracting the link from the html tag
	var2=$(echo $tag | grep -Po "(?<=>)([\w\s\.]+)(?=<\/)")	#extracting the title from the html tag
	arr+=("$var1,$var2")	#combining the link and the title in an array
done

for i in "${arr[@]}"; do echo "$i"; done	#printing the array in the format link,title


