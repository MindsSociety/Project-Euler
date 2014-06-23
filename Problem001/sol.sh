total=0;
for i in {0..999}; do
    if [ $((i % 3)) = 0 ] || [ $((i % 5)) = 0 ]
        then total=$((total + i))
    fi;
done;
echo $total
