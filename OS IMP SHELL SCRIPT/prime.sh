echo "enter n"
read n

count=0

for((i=1;i<=n;i++))
do
	if [ $(( n % i )) -eq 0 ]
		then
		count=$(( count + 1 ))
fi
done

if [ $count -eq 2 ]
	then
	echo "Prime Number"
else
	echo "Not Prime Number"
fi