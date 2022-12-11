#!/bin/bash

echo > bill.txt
echo "*-------Online BASH store-------*" >> bill.txt
printf '%s\t%s\t%s\t' "|Name" "Price" "Quant" "Total" "|" >> bill.txt
echo >> bill.txt
echo "|===============================|" >> bill.txt

total=0

products(){	#function that stored data (entered data) in text file, potentional bill at the end
	read -p "Enter the name of the product: " name		#
	read -p "Enter the quantity bought: " quantity		#enter product data
	read -p "Enter the price of the product: " price	#
	total=$((total+price*quantity))
	printf '%s\t%s\t%s\t' "|$name" "$quantity" "$price" "$((quantity*price))" "|" >> bill.txt
	echo >> bill.txt
}

printBill(){
	cat bill.txt
}

products
while true
do
	read -p "Do you want to check-out? y/n " answer
	if [ $answer == 'y' ]
	then
		echo "|===============================|" >> bill.txt
		printf '%s\t%s\t%s\t%s\t' "| Total: $total" "" "" "|" >> bill.txt
		echo >> bill.txt
		#echo "*-------Online BASH store-------*" >> bill.txt
		echo "*-----------Thank You-----------*" >> bill.txt
		printBill
		exit
	elif [ $answer == 'n' ]
	then
		products
		continue
	fi
done
