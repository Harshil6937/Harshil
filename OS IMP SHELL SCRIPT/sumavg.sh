echo "enter N"
read n

i=1
sum=0

while [ $i -le $n ]
do
	sum=$(( sum + i ))
	i=$(( i + 1 ))
done
avg=$(( sum / n ))
echo "Sum=$sum"
echo "AVG=$avg"
