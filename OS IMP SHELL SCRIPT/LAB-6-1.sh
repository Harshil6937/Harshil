echo "enter a"
read a
echo "enter b"
read b
echo "enter c"
read c

if [ $a -gt $b ]
then
	if [ $a -gt $c ]
	then
		echo "A is largest"
	else
		echo "C is largest"
	fi	
else
	if [ $b -gt $c ]
	then
		echo "B is largest"
	else
		echo "C is largest"
	fi
fi