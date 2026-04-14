echo "Enter Number"
read a

if [ `expr $a % 2` -eq 0 ]
then
	echo "Even Number"
else
	echo "Odd Number"
fi