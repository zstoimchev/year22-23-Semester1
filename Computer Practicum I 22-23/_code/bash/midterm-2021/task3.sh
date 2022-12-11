#!/bin/bash

m=$1		#m<n
n=$2
sum=0

summation(){
	echo $((m+n))
}

remainder(){
	echo $((n%m))
}

sumOdd(){	#sum of odd numbers between m and n
	for(( i=m; i<=n; i++ ))
	do
		if(( i%2!=0 ))
		then
			sum=$((sum+i))
		fi
	done
	echo $sum
}

checkArg(){
	if(( $#!=2 ))
	then
		exit 1
	fi
}

areNumm(){
	if !(echo $m | grep -qw [0-9]* && echo $n | grep -qw [0-9]*)
	then
		exit 1
	fi
}

lesser(){
	if(( $m>$n ))
	then
		exit 1
	fi
}

areNumm
checkArg $1 $2

lesser

summation
remainder
sumOdd
