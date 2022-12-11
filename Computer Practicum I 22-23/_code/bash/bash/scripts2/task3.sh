#!/bin/bash
#sum of digits

a=$1

while [ $a -gt 0 ]
do
        let sum=$sum+$a%10
        let a=$a/10
done
echo $sum

