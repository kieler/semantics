#!/bin/bash 

CURRENTDIR=`pwd`
cd /home/local/cruisecontrol/ccworkingdir/
/home/local/cruisecontrol/cruisecontrol-2-7-1/main/bin/cruisecontrol.sh -configfile /home/local/cruisecontrol/ccworkingdir/config.xml -jmxport 8000
cd $CURRENTDIR

