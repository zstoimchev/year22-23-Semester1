#!/bin/bash

echo -n "File which you want to check in your filesystem: "
read file

if [ -e $file ]
then
    echo "This file exists on your filesystem."
else
	echo "This file doesn't exist on your filesystem."
fi
