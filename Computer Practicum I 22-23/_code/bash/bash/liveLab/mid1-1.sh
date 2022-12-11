#!/bin/bash

a=$1
b=$2

difference (){
	expr $((a-b))
}

difference
