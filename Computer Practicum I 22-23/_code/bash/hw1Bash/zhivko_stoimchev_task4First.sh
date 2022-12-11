#!/bin/bash
#zhivko_stoimchev_89221056

var=$(git --version)
if( $var == 0 )
then
	git clone https://github.com/nuwanarti/cowsay.git
	if [[ -d ~/Desktop && -d "cowsay" ]]
	then
		cp -r cowsay ~/Desktop
		chmod +x ~/Desktop/cowsay/cowsay
		chmod +x ~/Desktop/cowsay/cowthink

	if grep -Fxq "alias cowsay='~/Desktop/cowsay/cowsay'" ~/.bashrc
	then
		x=1
	else
		echo "alias cowsay='~/Desktop/cowsay/cowsay'" >> ~/.bashrc
		echo "alias cowthink='~/Desktop/cowsay/cowthink'" >> ~/.bashrc
	fi
		PATH=$PATH:~/Desktop/cowsay
		cowsay -f stegosaurus "Thankyou for installing cowsay"
		cowsay --help
	else
		echo "Desktop/git repo not avaliable"
	fi
else
	echo error: git not installed
fi
