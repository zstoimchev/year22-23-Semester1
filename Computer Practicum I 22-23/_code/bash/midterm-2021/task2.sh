#!/bin/bash

read -p "Enter folder name: " folder

if echo $folder | grep -q [\ ]
then
	echo "Error: The name of the folder shouldn't contain any white spaces"
	exit
fi

if [ -d $folder ]
then
	rm -r ./$folder/*
else
	mkdir $folder
fi

read -p "Enter file name: " file
if echo $file | grep -q [\ ]
then
        echo "Error: The name of the file shouldn't contain any white spaces"
        exit
fi
touch ./$folder/$file

chmod 600 ./$folder/$file

ls -al ./ >> ./$folder/$file

echo "Content of $file:"
cat ./$folder/$file
