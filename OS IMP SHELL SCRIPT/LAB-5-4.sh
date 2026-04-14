echo "Enter a"
read a
echo "Enter b"
read b
echo "Enter c"
read c

if [ $a -gt $b ] && [ $b -gt $c ]
then
	echo "A is largest"
fi
if [ $b -gt $a ] && [ $b -gt $c ]
then 
	echo "b is largest"
fi
if [ $c -gt $a ] && [ $c -gt $b ]
then
	echo "c is largest"
fi