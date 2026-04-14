echo "enter num"
read n

a=0
b=1

for((i=1;i<=n;i++))
do
	echo -n "$a"
	r=$(( a + b ))
	a=$b
	b=$r
done