#!/bin/bash

CURRENTDIR=`pwd`
cd /home/local/cruisecontrol/ccworkingdir/
PID=`cat cc.pid`
echo CruiseControl PID is $PID and gets killed
kill $PID
cd $CURRENTDIR
exit 0





