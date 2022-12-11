#!/bin/bash

read -p "Enter name of file: " file

touch ./$file

ls -al > ./$file

echo >> ./$file
echo "User: $(command whoami)" >> ./$file
echo "OS: $(command uname)" >> ./$file

cat ./$file
