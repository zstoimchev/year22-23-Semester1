#!/bin/bash

ls -al ~/ > vsebina.txt

cat vsebina.txt
echo
echo All enteries that represent directory:
grep "^d" vsebina.txt
echo
echo All files ending with .sh
grep ".sh$" vsebina.txt
echo
grep " 0 " vsebina.txt

