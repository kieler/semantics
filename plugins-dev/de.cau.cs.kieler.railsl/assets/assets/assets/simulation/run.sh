#!/bin/bash
#copy the main file
cp ../code/Controller/kieler-gen/src/ControllerMain.c RailwayControllerC/SampleController.c
# search for the included .c file and copy it into the RailwayControllerC folder
TICK_FILE=$(find ../Controller/ -name $( \
	cat RailwayControllerC/SampleController.c \
		| grep -E "^#include\s+\".*\"" `# get included filed` \
		| grep -oE "[a-zA-Z_.]+\.[c]"  `# filter only the name of .c filed` \
		| head -1                      `# get only the first one` \
	) | head -1) # get only the first file with matching name
echo "Tick File: $(TICK_FILE)"
cp "$TICK_FILE"  RailwayControllerC/
make SampleController.bin
./Executables/SampleController

