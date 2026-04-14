echo "enter ch"
read ch

case $ch in
	a|i|e|o|u|A|I|E|O|U) echo "vowel";;
	*) echo "consonant";;
esac