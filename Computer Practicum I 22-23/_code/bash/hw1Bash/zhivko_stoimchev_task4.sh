#!/bin/bash

var=$(git --version)	#check version of git
if( $var == 0 )	
then
	[[ -d "cowsay" ]] || git clone https://github.com/nuwanarti/cowsay.git	#if there is directory "cowsay" on desktop skip, otherwise clone the repository from github
	if [[ -d ~/Desktop && -d "cowsay" ]]	#check if there exists Desktop directory and cowsay directory in the current working folder
	then
		[[ -d ~/Desktop/cowsay ]] || cp -r cowsay ~/Desktop	#if cowsay if avaliable on desktop skip, otherwise copy
		chmod 711 ~/Desktop/cowsay/cowsay	#giving executable permision for everyone
		chmod 711 ~/Desktop/cowsay/cowthink	#giving executable permision for everyone

		if !(grep -Fxq "alias cowsay='~/Desktop/cowsay/cowsay'" ~/.bashrc)	#checks if allias is avaliable in ~./bashrc for cowsay, if there is for cowsay there is also for cowthink
		then
			echo "alias cowsay='~/Desktop/cowsay/cowsay'" >> ~/.bashrc	#creating alias for cowsay
			echo "alias cowthink='~/Desktop/cowsay/cowthink'" >> ~/.bashrc	#creating alias for cowthink
		fi
		PATH=$PATH:~/Desktop/cowsay	#adding cowsay to path so user can be able to run it from everywhere
		cowsay -f stegosaurus "Thankyou for installing cowsay"	#printing thank you message using cowsay
		cowsay --help	#displaying help about the usage of the application
	else
		echo "Desktop/git repo not avaliable"
	fi
else
	echo git not installed
fi
