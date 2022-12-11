#!/bin/bash
var1=0
var2=0
op=0
res=0
readFromUser(){
	read -p "$1" var1
	read -p "$2" var2
	read -p "$3" op
}
performArithmeticSum(){
	#Res=0
	case $3 in
		+)
		res=$(($1+$2))
		;;
		-)
		res=$(($1-$2))
		;;
		x)
		res=$(($1*$2))
		;;
		/)
		res=$(($1/$2))
		;;
	esac
	#return res
}
printResults(){
	echo $1 $3 $2 = $4
}

readFromUser "Please enter value 1: " "Please enter value 2: " "Please enter operation as +,-,x,/: "
performArithmeticSum $var1 $var2 $op
printResults $var1 $var2 $op $res

