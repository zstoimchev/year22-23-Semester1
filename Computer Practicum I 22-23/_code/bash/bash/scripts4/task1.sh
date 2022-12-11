#!/bin/bash

options(){
	while getopts "cdu" opt;
	do
		case $opt in
        		c) clear; ;;
        		d) ls; ;;
        		u) id; ;;
        		\?) echo "Usage Help: ./task1.sh [-c] [-d] [-u]" ;;
		esac
	done
}

options $@

