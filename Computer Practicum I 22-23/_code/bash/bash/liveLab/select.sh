#!/bin/bash
# A symple menu system with select

names='Alen Marko Aleks Quit'

PS3='Select person: '

select name in $names
do
if [ $name == 'Quit' ]
then
break
fi
echo Hello $name
done

echo Bye.
