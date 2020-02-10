#!/bin/bash

THIS="${BASH_SOURCE[0]}"

if [ -z "$SIMULATOR_EXE" -o -z "$OUTPUT_CSV" ]; then
	echo 'missing ENV-Variables: $SIMULATOR_EXE and/or $OUTPUT_CSV'
	exit
fi

# arg1: testfile, if not supplied: search for *.test.json
if [ -z "$1" ]; then
	echo "Model;Ticks;Time;AvgTime;MinTime;MaxTime;num output errors;terminated Early;fileSize;diskUsage" > "$OUTPUT_CSV"
	find ./ -name "*.test.json" -exec "$THIS" "{}" \;
else
	TESTFILE="$1"
	
	# arg2: model-executable, if not supplied: search for <testfilename>.exe in subdirectories
	if [ -z "$2" ]; then
		TESTFILEDIR=`dirname "$TESTFILE"`
		MODELNAME=`basename "${TESTFILE/%.test.json/.exe}"`
		find "$TESTFILEDIR" -name "$MODELNAME" -exec "$THIS" "$TESTFILE" "{}" \;
	else
		MODEL="$2"
		echo "TESTFILE+Model: $TESTFILE , $MODEL"
		
		LOGFILE="${MODEL/%.exe/.log.csv}"
		
		(
			echo "\"$MODEL\";"$( \
				cat "$TESTFILE" | $SIMULATOR_EXE "$MODEL" | tee "$LOGFILE" | tail --lines=1 \
			)";"$( \
				du -b "$MODEL"|cut -f1 \
			)";"$( \
				du --block-size=1 "$MODEL"|cut -f1 \
			)
		) >> "$OUTPUT_CSV"
	fi
fi
