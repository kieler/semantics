#!/bin/bash
#copy the main file
CONTROLLER_TARGET=./RailController.c

echo "Copying:   ../interface/ControllerMainManual.c"
cp -u ../interface/ControllerMainManual.c $CONTROLLER_TARGET
# search for the included .c file and copy it into the RailwayControllerC folder
cat $CONTROLLER_TARGET \
	| grep -E "^\s*#include\s+\".*\"" `# get included filed` \
	| grep -oE "[a-zA-Z_.]+\.[c]"  `# filter only the name of .c filed` \
	| (while read -r FILENAME; do
		FILE=$(find ../Controller/ -name $FILENAME | head -1)
		echo "Tick File: $FILE"
		cp -u $FILE ./
	done)

make RailController

