echo "enter a"
read a
echo "enter b"
read b

echo "enter op"
read op

case $op in
	+) echo "r = $((a+b))";;
	-) echo "r=$((a-b))";;
	\*)echo "r=$((a * b))";;
	/)echo "r=$((a / b ))";;
	*)echo "invalid";;	
esac