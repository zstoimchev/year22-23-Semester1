#!/bin/bash

command(){

if [ $# == 4 ]
then
        if [ -f $1 ]
        then
                echo -n $2 'is located' $(grep -c -w $2 $1) 'times on line ' $( grep -n $3 $1 | cut -d: -f1 )
                echo
                echo -n $3 'is located ' $(grep -c -w $3 $1) 'times on line '  $( grep -n $3 $1 | cut -d: -f1 )
                echo
                echo -n $4 'is located' $(grep -c -w $4 $1) 'times on line '  $( grep -n $4 $1 | cut -d: -f1 )

		echo
	return 0
        else
                echo "File does not exist."
        fi
else
        return 1
fi
}

command $1 $2 $3 $4
