#!/bin/sh
#
# pre-process rif files for gnuplot-rif

riffile=$1

cat  $riffile | \
    grep -e '#outs'  -e '#step' | \
    sed -e 's/True[ \t$]/1 /g'  -e 's/true[ \t$]/1 /g'  -e 's/t[ \t$]/1 /g' -e 's/T[ \t$]/1 /g' | \
    sed -e 's/[ \t]True/ 1 /g'   -e 's/[ \t]true/ 1/g'   -e 's/[ \t]t/ 1/g'  -e 's/[ \t]T/ 1/g' | \
    sed -e 's/False[ \t$]/0 /g' -e 's/false[ \t$]/0 /g' -e 's/f[ \t$]/0 /g' -e 's/F[ \t$]/0 /g' | \
    sed -e 's/[ \t]False/ 0/g'  -e 's/[ \t]false/ 0/g'  -e 's/[ \t]f/ 0/g'  -e 's/[ \t]F/ 0/g' | \
    sed -e 'N; s/#step \([0-9]*\)\(.*\)\(^.*\)#outs \(.*\)/\1  \3 \4/g' 

#    sed -e 'N; s/#step \([0-9]*\)\([^0-9\-]*\)\(.*\)#outs \(.*\)/\1  \3 \4/g' 

