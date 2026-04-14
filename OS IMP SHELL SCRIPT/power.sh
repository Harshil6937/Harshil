echo "enter x"
read x
echo "enter y"
read y

a=1

for((i=1;i<=y;i++))
do
	a=$((x * a))
done

echo "$a"