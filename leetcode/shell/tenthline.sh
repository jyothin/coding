#!/bin/bash

FILENAME=file.txt
count=0
while read -r line
do
	let $((count++))
	if [[ $count == 10 ]]
	then
		echo $line
		exit 0
	fi
done < "$FILENAME"

# Solution 2
awk 'FNR == 10 {print }'  file.txt
# OR
awk 'NR == 10' file.txt

# Solution 3
sed -n 10p file.txt

# Solution 4
tail -n+10 file.txt|head -1
