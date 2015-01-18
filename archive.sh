#!/bin/bash --login

output=$1
input=$2

if [ -z "${output}" -o -z "${input}" ]; then
    echo "usage: archive.sh <output> <input>"
fi

tar -zcvf archive/${output}.tar.gz ${input}